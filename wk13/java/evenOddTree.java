// problem link: https://leetcode.com/problems/even-odd-tree/description/

class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        LinkedList<TreeNode> ll = new LinkedList<>();
        ll.add(root);
        boolean odd = true;
        while(!ll.isEmpty()) {
            int s = ll.size(), past = odd ? 0 : 1000001;
            while(s-- > 0) {
                TreeNode n = ll.poll();
                if(((n.val % 2 == 1) != odd) || (n.val == past) || ((n.val > past) != odd))
                    return false;
                past = n.val;
                if(n.left != null)
                    ll.add(n.left);
                if(n.right != null)
                    ll.add(n.right);
            }
            odd = !odd;
        }
        return true;
    }
}