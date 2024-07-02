package LeetCode.Easy;
/*
*
* https://leetcode.com/problems/length-of-last-word
*
* */

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ') {
                return s.length() - i - 1;
            }
        }
        return s.length();
    }
}
