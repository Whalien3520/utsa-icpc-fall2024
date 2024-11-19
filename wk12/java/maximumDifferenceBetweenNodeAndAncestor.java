// problem link: https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/description/

class Solution {
    public int maxAncestorDiff(TreeNode root) {
        return Math.max(rec(root.val, root.val, root.left), rec(root.val, root.val, root.right));
    }
    private int rec(int l, int h, TreeNode root) {
        if(root == null)
            return 0;
        int d = Math.max(Math.abs(l - root.val), Math.abs(h - root.val));
        l = root.val < l ? root.val : l;
        h = root.val > h ? root.val : h;
        int a = rec(l, h, root.left), b = rec(l, h, root.right);
        return Math.max(Math.max(a, b), d);
    }
}