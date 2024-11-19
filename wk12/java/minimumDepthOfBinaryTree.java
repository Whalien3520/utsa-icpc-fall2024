// problem link: https://leetcode.com/problems/minimum-depth-of-binary-tree/description

class Solution {
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        LinkedList<TreeNode> q = new LinkedList<>();
        root.val = 1;
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode c = q.poll();
            if(c.left == null && c.right == null)
                return c.val;
            if(c.left != null) {
                c.left.val = c.val + 1;
                q.add(c.left);
            }
            if(c.right != null) {
                c.right.val = c.val + 1;
                q.add(c.right);
            }
        }
        return -1;
    }
}