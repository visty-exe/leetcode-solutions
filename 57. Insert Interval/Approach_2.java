class Solution {
    public int[][] insert(int[][] in, int[] nein) {
        ArrayList<int[]> result = new ArrayList<>();
        int i = 0;
        int n = in.length;

        while (i < n && in[i][1] < nein[0]) {
            result.add(in[i]);
            i++;
        }
        while (i < n && in[i][0] <= nein[1]) {
            nein[0] = Math.min(nein[0], in[i][0]);
            nein[1] = Math.max(nein[1], in[i][1]);
            i++;
        }
        result.add(nein);
        while (i < n) {
            result.add(in[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }
}