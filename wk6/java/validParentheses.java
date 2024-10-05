class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> ll = new LinkedList<Character>();
        String open = "({["; String close = ")}]";
        for(int i = 0; i < s.length(); i++)
        {
            if(open.indexOf(s.charAt(i)) > -1)
                ll.push(s.charAt(i));
            else if(ll.peek() == null || open.indexOf(ll.pop()) != close.indexOf(s.charAt(i)))
                return false;
        }
        return ll.peek() == null;
    }
}