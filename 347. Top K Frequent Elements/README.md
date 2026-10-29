# 347. Top K Frequent Elements

### Difficulty: Medium

## Description
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 
Example 1:


Input: nums = [1,1,1,2,2,3], k = 2

Output: [1,2]


Example 2:


Input: nums = [1], k = 1

Output: [1]


Example 3:


Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2

Output: [1,2]


 
Constraints:


	1 <= nums.length <= 105
	-104 <= nums[i] <= 104
	k is in the range [1, the number of unique elements in the array].
	It is guaranteed that the answer is unique.


 
Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.

## Submission Details
- **Status**: Accepted
- **Runtime**: 5
- **Memory**: 47216000
- **Language**: java

## Code
```java

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];

        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        int[] freq = new int[max - min + 1];

        for (int n : nums) {
            freq[n - min]++;
        }

        int[] res = new int[k];
        int index = 0;

        while (index < k) {
            int lar = 0;
            int num = -1;

            for (int i = 0; i < freq.length; i++) {
                if (freq[i] > lar) {
                    lar = freq[i];
                    num = i;
                }
            }

            res[index++] = num + min;
            freq[num] = 0;
        }

        return res;
    }
}

```
