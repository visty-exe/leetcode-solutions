class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> hs= new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int n=target-nums[i];
        if(hs.containsKey(n)){
            return new int[]{hs.get(n),i};
        }
        hs.put(nums[i],i);
      }  
      return new int[]{-1, -1};
    }
}