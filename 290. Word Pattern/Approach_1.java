class Solution {
    public boolean wordPattern(String pattern, String st) {
        String[] s= st.split(" "); 
        if(s.length!=pattern.length()){
            return false;
        }
        HashMap<Character,String> hs= new HashMap<>();
        for(int i=0;i<s.length;i++){
            char c= pattern.charAt(i);
            String s1=s[i];

            if(hs.containsKey(c)){
                if(!s1.equals(hs.get(c))){
                    return false;
                }
            }else if(hs.containsValue(s1)){
                return false;
            }
            
            else {
                hs.put(c,s1);
            }
            
        }
        return true;
    }
}