// problem link: https://leetcode.com/problems/evaluate-reverse-polish-notation/description/

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String token : tokens) {
            if(token.equals("+"))
                s.push(s.pop() + s.pop());
            else if(token.equals("-")) {
                int a = s.pop(), b = s.pop();
                s.push(b - a);
            }
            else if(token.equals("*"))
                s.push(s.pop() * s.pop());
            else if(token.equals("/")) {
                int a = s.pop(), b = s.pop();
                s.push(b / a);
            }
            else
                s.push(Integer.parseInt(token));
        }
        return s.pop();
    }
}