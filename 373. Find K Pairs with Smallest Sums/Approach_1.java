class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ls = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            pq.add(new int[] { nums1[i] + nums2[0], i, 0 });
        }

        while (k > 0 && !pq.isEmpty()) {
            int[] pair = pq.poll();
            int i = pair[1];
            int j = pair[2];

            ls.add(Arrays.asList(nums1[i], nums2[j]));
            if (j + 1 < nums2.length) {
                pq.add(new int[] {
                        nums1[i] + nums2[j + 1],
                        i,
                        j + 1
                });
            }
            k--;
        }

        return ls;
    }
}