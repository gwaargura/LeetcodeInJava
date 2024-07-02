package LeetCode.Easy;

/*
*
* Return if a number is palindrome (121 forward = backward)
*
* */

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String str = x + "";

        int low = 0, high = str.length()-1;
        while(low<high) {
            if(str.charAt(low) != str.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(10));
        System.out.println(p.isPalindrome(12321));
        System.out.println(p.isPalindrome(11));
        System.out.println(p.isPalindrome(-10));
    }
}
