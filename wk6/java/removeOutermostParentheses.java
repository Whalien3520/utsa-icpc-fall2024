// problem link: https://leetcode.com/problems/remove-outermost-parentheses/

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ret = new StringBuilder();
        boolean prim = false;
        int c = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                if(!prim)
                    prim = true;
                else {
                    ret.append('(');
                    c++;
                }
            }
            else {
                if(c == 0 && prim)
                    prim = false;
                else {
                    ret.append(')');
                    c--;
                }
            }
        }
        return ret.toString();
    }
}