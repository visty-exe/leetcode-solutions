class Solution {
    int dp[];
    public int rob(int[] nums) {
        int n= nums.length;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return rec(n-1,nums);
    }
    private int rec(int n,int[] nums){
        if(n==0){
            return nums[0];
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int pick=nums[n]+rec(n-2,nums);
        int noPick=0+rec(n-1,nums);

        return dp[n]= Math.max(pick,noPick);
    }
}