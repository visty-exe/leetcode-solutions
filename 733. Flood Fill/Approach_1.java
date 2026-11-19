class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        if (original == color) {
            return image;
        }
        dfs(image, sr, sc, color, original);
        return image;
    }

    public void dfs(int[][] mat, int r, int c, int color, int original) {
        if (r < 0 || c < 0 || r >= mat.length || c >= mat[0].length || mat[r][c] != original) {
            return;
        }
        mat[r][c] = color;
        dfs(mat, r + 1, c, color, original);
        dfs(mat, r - 1, c, color, original);
        dfs(mat, r, c + 1, color, original);
        dfs(mat, r, c - 1, color, original);
    }
}