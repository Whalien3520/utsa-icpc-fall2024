// problem link: https://leetcode.com/problems/same-tree/description/

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        LinkedList<TreeNode> l = new LinkedList<>(), r = new LinkedList<>();
        l.add(p);
        r.add(q);
        while(!l.isEmpty() && !r.isEmpty()) {
            TreeNode ll = l.poll(), rr = r.poll();
            if((ll == null) != (rr == null))
                return false;
            if(ll == null)
                continue;
            if(ll.val != rr.val)
                return false;
            l.add(ll.left);
            l.add(ll.right);
            r.add(rr.left);
            r.add(rr.right);
        }
        return true;
    }
}