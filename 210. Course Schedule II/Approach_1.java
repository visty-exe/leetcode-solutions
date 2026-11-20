
class Solution {
    public int[] findOrder(int V, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : prerequisites) {
            int u = edge[1];
            int v = edge[0];

            adj.get(u).add(v);
        }

        Stack<Integer> st = new Stack<>();

        boolean[] vis = new boolean[V];
        boolean[] pathVis = new boolean[V];

        int[] ls = new int[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (dfs(i, vis, st, adj, pathVis)) {
                    return new int[0];
                }
            }
        }

        int i = 0;

        while (!st.isEmpty()) {
            ls[i++] = st.pop();
        }

        return ls;
    }

    private boolean dfs(int node, boolean[] vis,
            Stack<Integer> st,
            ArrayList<ArrayList<Integer>> adj,
            boolean[] pathVis) {

        vis[node] = true;
        pathVis[node] = true;

        for (int neigh : adj.get(node)) {

            if (!vis[neigh]) {
                if (dfs(neigh, vis, st, adj, pathVis)) {
                    return true;
                }
            } else if (pathVis[neigh]) {
                return true;
            }
        }

        pathVis[node] = false;

        st.push(node);

        return false;
    }
}
