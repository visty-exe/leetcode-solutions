# 215. Kth Largest Element in an Array

### Difficulty: Medium

## Description
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

 
Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4

 
Constraints:


	1 <= k <= nums.length <= 105
	-104 <= nums[i] <= 104

## Submission Details
- **Status**: Accepted
- **Runtime**: 70
- **Memory**: 74072000
- **Language**: java

## Code
```java
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int n: nums){
            pq.add(n);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
```
