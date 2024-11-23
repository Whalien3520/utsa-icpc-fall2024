// problem link: https://leetcode.com/problems/average-of-levels-in-binary-tree/description/

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        LinkedList<TreeNode> cur = new LinkedList<>();
        cur.add(root);
        List<Double> ret = new ArrayList<>();
        while(!cur.isEmpty()) {
            LinkedList<TreeNode> next = new LinkedList<>();
            double sum = 0, cnt = 0;
            while(!cur.isEmpty()) {
                TreeNode n = cur.poll();
                sum += n.val;
                cnt++;
                if(n.left != null)
                    next.add(n.left);
                if(n.right != null)
                    next.add(n.right);
            }
            ret.add(sum / cnt);
            cur = next;
        }
        return ret;
    }
}