// problem link: https://leetcode.com/problems/valid-palindrome/description/

class Solution {
    public boolean isPalindrome(String s) {
        int fro = 0, bac = s.length() - 1;
        while (fro < bac) {
            if (!Character.isLetterOrDigit(s.charAt(fro)))
                fro++;
            else if (!Character.isLetterOrDigit(s.charAt(bac)))
                bac--;
            else {
                if (Character.toLowerCase(s.charAt(fro)) != Character.toLowerCase(s.charAt(bac)))
                    return false;
                fro++;
                bac--;
            }
        }
        return true;
    }
}