class Solution {
    int dp[];
    public int rob(int[] nums) {
        int n= nums.length;
        dp = new int[n];
        dp[0]=nums[0];

        for(int i=1;i<n;i++){
            int pick=nums[i];
            if(i>1){
                pick +=dp[i-2];
            }
            int noPick=dp[i-1];
            dp[i]= Math.max(pick,noPick);
        }
        return dp[n-1];
    }
}