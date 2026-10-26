# 49. Group Anagrams

### Difficulty: Medium

## Description
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

 
Example 1:


Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:


	There is no string in strs that can be rearranged to form "bat".
	The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
	The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.



Example 2:


Input: strs = [""]

Output: [[""]]


Example 3:


Input: strs = ["a"]

Output: [["a"]]


 
Constraints:


	1 <= strs.length <= 104
	0 <= strs[i].length <= 100
	strs[i] consists of lowercase English letters.

## Submission Details
- **Status**: Accepted
- **Runtime**: 8
- **Memory**: 48968000
- **Language**: java

## Code
```java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hs= new HashMap<>();

        for(String s: strs){
            char[] ch= s.toCharArray();
            Arrays.sort(ch);
            String sorted=new String(ch);

            if(!hs.containsKey(sorted)){
                hs.put(sorted,new ArrayList<>());
            }
            hs.get(sorted).add(s);
        }
        return new ArrayList<>(hs.values());
    }
}
```
