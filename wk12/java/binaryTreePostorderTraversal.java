// problem link: https://leetcode.com/problems/binary-tree-postorder-traversal/description/

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root == null)
            return ret;
        Stack<TreeNode> s = new Stack<>();
        s.add(root);
        while(!s.isEmpty()) {
            TreeNode c = s.pop();
            ret.add(c.val);
            if(c.left != null)
                s.add(c.left);
            if(c.right != null)
                s.add(c.right);
        }
        Collections.reverse(ret);
        return ret;
    }
}