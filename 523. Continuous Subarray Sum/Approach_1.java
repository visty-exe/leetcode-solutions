class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> hs= new HashMap<>();
        hs.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int remain=(sum%k);
            if(hs.containsKey(remain)){
                if(i-hs.get(remain)>1){
                    return true;
                }
            }else{
                hs.put(remain,i);
            }
        }
        return false;
    }
}