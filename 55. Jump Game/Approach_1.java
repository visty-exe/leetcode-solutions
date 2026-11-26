class Solution {
    int maxJump=0;
    public boolean canJump(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(maxJump<i) return false;
            maxJump= Math.max(maxJump,nums[i]+i);
        }
        return true;
    }
}