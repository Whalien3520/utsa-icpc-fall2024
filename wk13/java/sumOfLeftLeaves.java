// problem link: https://leetcode.com/problems/sum-of-left-leaves/description/

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        LinkedList<TreeNode> ll = new LinkedList<>();
        int ret = 0;
        ll.add(root);
        while(!ll.isEmpty()) {
            TreeNode n = ll.poll();
            if(n.left != null) {
                ll.add(n.left);
                if(n.left.left == null && n.left.right == null)
                    ret += n.left.val;
            }
            if(n.right != null)
                ll.add(n.right);
        }
        return ret;
    }
}