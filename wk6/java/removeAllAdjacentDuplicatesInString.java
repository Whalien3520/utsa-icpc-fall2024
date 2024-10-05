// problem link: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

class Solution {
    public String removeDuplicates(String s) {
        LinkedList<Character> sta = new LinkedList<>();
        for(int i = 0; i < s.length(); i++) {
            if(sta.isEmpty() || sta.peek() != s.charAt(i))
                sta.push(s.charAt(i));
            else
                sta.pop();
        }
        StringBuilder ret = new StringBuilder();
        while(!sta.isEmpty())
            ret.append(sta.pollLast());
        return ret.toString();
    }
}