class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max=0;
        Set<Character> set= new HashSet<>();

        for(int r=0;r<s.length();r++){
            char cr= s.charAt(r);

            while(set.contains(cr)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(cr);
            max= Math.max(max,r-left+1);
        }
        return max;
    }
}