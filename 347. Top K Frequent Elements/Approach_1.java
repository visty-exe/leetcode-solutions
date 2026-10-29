
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
