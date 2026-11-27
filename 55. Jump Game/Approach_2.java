class Solution {
    int maxSum=0;
    public boolean canJump(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(maxSum<i) return false;
            maxSum= Math.max(nums[i]+i,maxSum);
        }
        return true;
    }
}