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