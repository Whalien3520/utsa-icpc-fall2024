// problem link: https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/description/
class Solution {
    private int ret = 0, s;
    public int amountOfTime(TreeNode root, int start) {
        s = start;
        dfs(root);
        return ret;
    }
    private int dfs(TreeNode root) {
        if(root == null)
            return 0;
        int l = dfs(root.left), r = dfs(root.right), d = 0;
        if(root.val == s) {
            ret = Math.max(l, r);
            d = -1;
        }
        else if(l >= 0 && r >= 0)
            d = Math.max(l, r) + 1;
        else {
            ret = Math.max(ret, Math.abs(l - r));
            d = Math.min(l, r) - 1;
        }
        return d;
    }
}