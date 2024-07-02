package LeetCode.Easy;

public class LongestParentheses {
    public boolean isValid(String s) {
        char[] chars = {'(', ')', '{', '}', '[', ']'};

        for(int i = 0; i < s.length() - 1; i++){
            for(int j = 0; j < chars.length - 1; j++){
                if(s.charAt(i) == chars[j]){
                    if(s.charAt(i+1) != chars[j+1]){
                        return false;
                    }
                    i = i + 1;
                    j = j + 1;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LongestParentheses lp = new LongestParentheses();
        System.out.println(lp.isValid("()[]{}"));
    }
}
