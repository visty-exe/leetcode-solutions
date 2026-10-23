# 74. Search a 2D Matrix

### Difficulty: Medium

## Description
You are given an m x n integer matrix matrix with the following two properties:


	Each row is sorted in non-decreasing order.
	The first integer of each row is greater than the last integer of the previous row.


Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

 
Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true


Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false


 
Constraints:


	m == matrix.length
	n == matrix[i].length
	1 <= m, n <= 100
	-104 <= matrix[i][j], target <= 104

## Submission Details
- **Status**: Accepted
- **Runtime**: 0 ms
- **Memory**: 42812000
- **Language**: java

## Code
```java
class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int m = nums.length;
        int n = nums[0].length;
        int left = 0;
        int right = m * n - 1;

        while (left <= right) {
            int mid = right - left / 2;
            int midElement = nums[mid / n][mid % n];

            if (midElement== target) {
                return true;
            } else if (midElement > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
```
