package LeetCode.Easy;

/*
*
* Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string
*
* */
public class FirstIndexOfOccurence {
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null || haystack.length() < needle.length()){
            return -1;
        }
        int j = -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if(i + needle.length() > haystack.length()){
                    return -1;
                }
                j = i;
                String a = haystack.substring(j, i + needle.length());
                if(a.equals(needle)){
                    return j;
                }
            }
        }
        return j;
    }

    public static void main(String[] args) {
        FirstIndexOfOccurence obj = new FirstIndexOfOccurence();
//        System.out.println(obj.strStr("Hello", "World"));
//        System.out.println(obj.strStr("Hello", "llo"));
//        System.out.println(obj.strStr("aaa", "a"));
//        System.out.println(obj.strStr("aaa", "abaaa"));
//        System.out.println(obj.strStr("mississippi", "issipi"));
        System.out.println(obj.strStr("mississippi", "pi"));
    }
}
