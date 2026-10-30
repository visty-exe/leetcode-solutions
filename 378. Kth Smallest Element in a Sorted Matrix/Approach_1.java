class Solution {
    public int kthSmallest(int[][] nums, int k) {
        int n= nums.length;
        int m= nums[0].length;

        int temp[]= new int[n*m];
        int index=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                temp[index++]= nums[i][j];
            }
        }
        Arrays.sort(temp);
        return temp[k-1];
    }
}