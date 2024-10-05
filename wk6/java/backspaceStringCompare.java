// problem link: https://leetcode.com/problems/backspace-string-compare/

class Solution {
    public boolean backspaceCompare(String s, String t) {
        int ss = s.length(), tt = t.length(), sc = 0, tc = 0;
        while(ss >= 0 || tt >= 0) {
            while(--ss >= 0) {
                if(s.charAt(ss) == '#')
                    sc++;
                else if(sc > 0)
                    sc--;
                else
                    break;
            }
            while(--tt >= 0) {
                if(t.charAt(tt) == '#')
                    tc++;
                else if(tc > 0)
                    tc--;
                else
                    break;
            }
            if(ss >= 0 != tt >= 0)
                return false;
            if(ss < 0)
                break;
            if(s.charAt(ss) != t.charAt(tt))
                return false;
        }
        return true;
    }
}