/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean isForward = true;

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode el = q.poll();
                if (isForward)
                    list.addLast(el.val);
                else
                    list.addFirst(el.val);
                if (el.left != null) {
                    q.offer(el.left);
                }
                if (el.right != null) {
                    q.offer(el.right);
                }
            }
            res.add(list);
            isForward = !isForward;
        }

        return res;
    }
}