// problem link: https://leetcode.com/problems/sum-root-to-leaf-numbers/description/

class Solution {
    public int sumNumbers(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);
        int ret = 0;
        while(!q.isEmpty()) {
            TreeNode c = q.poll();
            if(c.left == null && c.right == null)
                ret += c.val;
            else {
                if(c.left != null) {
                    c.left.val += c.val * 10;
                    q.add(c.left);
                }
                if(c.right != null) {
                    c.right.val += c.val * 10;
                    q.add(c.right);
                }
            }
        }
        return ret;
    }
}