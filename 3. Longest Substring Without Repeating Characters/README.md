# 3. Longest Substring Without Repeating Characters

### Difficulty: Medium

## Description
Given a string s, find the length of the longest substring without duplicate characters.

 
Example 1:


Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.


Example 2:


Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.


Example 3:


Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


 
Constraints:


	0 <= s.length <= 105
	s consists of English letters, digits, symbols and spaces.

## Submission Details
- **Status**: Accepted
- **Runtime**: 65
- **Memory**: 47076000
- **Language**: java

## Code
```java
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
```
