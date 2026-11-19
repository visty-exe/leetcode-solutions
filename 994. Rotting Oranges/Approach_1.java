class Solution {
    public int orangesRotting(int[][] grid) {
        int r=grid.length;
        int c= grid[0].length;
        int time[][]= new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                time[i][j]=Integer.MAX_VALUE;
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2){
                    dfs(grid,i,j,time,0);
                }
            }
        }

        int max=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    if(time[i][j]==Integer.MAX_VALUE) return -1;
                    else max=Math.max(max,time[i][j]);
                }
            }
        }
        return max;
    }
    public void dfs(int[][] grid,int row,int col,int[][] time,int currTime){
        if(row<0||col<0||row>=grid.length||col>=grid[0].length||grid[row][col]==0 || currTime>time[row][col]){
            return;
        }
        time[row][col]=currTime;
        dfs(grid,row+1,col,time, currTime+1);
        dfs(grid,row-1,col,time, currTime+1);
        dfs(grid,row,col+1,time, currTime+1);
        dfs(grid,row,col-1,time, currTime+1);
    }
}