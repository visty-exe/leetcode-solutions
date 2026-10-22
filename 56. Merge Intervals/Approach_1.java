class Solution {
    public int[][] merge(int[][] in) {
        if (in.length == 0) {
            return new int[0][0];
        }
        Arrays.sort(in, (a, b) -> a[0] - b[0]);
        ArrayList<int[]> result = new ArrayList<>();
        int[] prev = in[0];
        int n = in.length;
        for (int i = 1; i < n; i++) {
            if (prev[1] >= in[i][0]) {
                prev[1] = Math.max(prev[1], in[i][1]);
            } else {
                result.add(prev);
                prev = in[i];
            }

        }
        result.add(prev);
        return result.toArray(new int[result.size()][]);
    }
}