class Solution {
    public int[][] insert(int[][] in, int[] nein) {
        int[][] new1 = new int[in.length + 1][2];
        for (int i = 0; i < in.length; i++) {
            new1[i] = in[i];
        }
        new1[new1.length - 1] = nein;
        Arrays.sort(new1, (a, b) -> a[0] - b[0]);
        ArrayList<int[]> result = new ArrayList<>();
        int prev[] = new1[0];
        for (int i = 1; i < new1.length; i++) {
            if (prev[1] >= new1[i][0]) {
                prev[1] = Math.max(prev[1], new1[i][1]);
            } else {
                result.add(prev);
                prev = new1[i];
            }
        }
        result.add(prev);
        return result.toArray(new int[result.size()][]);
    }
}