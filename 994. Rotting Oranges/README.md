# 994. Rotting Oranges

### Difficulty: Medium

## Description
You are given an m x n grid where each cell can have one of three values:


	0 representing an empty cell,
	1 representing a fresh orange, or
	2 representing a rotten orange.


Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.

 
Example 1:


Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
Output: 4


Example 2:


Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
Output: -1
Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.


Example 3:


Input: grid = [[0,2]]
Output: 0
Explanation: Since there are already no fresh oranges at minute 0, the answer is just 0.


 
Constraints:


	m == grid.length
	n == grid[i].length
	1 <= m, n <= 10
	grid[i][j] is 0, 1, or 2.

## Submission Details
- **Status**: Accepted
- **Runtime**: 3
- **Memory**: 43508000
- **Language**: java

## Code
```java
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
```
