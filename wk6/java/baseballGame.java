// problem link: https://leetcode.com/problems/baseball-game/

class Solution {
    public int calPoints(String[] operations) {
        int ret = 0;
        Stack<Integer> s = new Stack<>();
        s.push(Integer.parseInt(operations[0]));
        ret += s.peek();
        for(int i = 1; i < operations.length; i++) {
            if(operations[i].equals("+")) {
                int a = s.pop(), b = s.peek();
                s.push(a);
                s.push(a + b);
                ret += a + b;
            }
            else if(operations[i].equals("D")) {
                s.push(s.peek() * 2);
                ret += s.peek();
            }
            else if(operations[i].equals("C"))
                ret -= s.pop();
            else {
                s.push(Integer.parseInt(operations[i]));
                ret += s.peek();
            }
        }
        return ret;
    }
}