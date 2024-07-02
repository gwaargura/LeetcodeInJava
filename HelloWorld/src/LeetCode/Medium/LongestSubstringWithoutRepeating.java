package LeetCode.Medium;

/*
 * STATUS: DONE
 * OPTIMIZED: 100%
 * DESCRIPTION: Find longest substring of given string, without repeating characters.
 *
 * Link: https://leetcode.com/problems/longest-substring-without-repeating-characters
 *
 * */

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("3: " + lengthOfLongestSubstring("abcabcbb"));
        System.out.println("1: " + lengthOfLongestSubstring("bbbbb"));
        System.out.println("3: " + lengthOfLongestSubstring("pwwkew"));
        System.out.println("2: " + lengthOfLongestSubstring("au"));
        System.out.println("3: " + lengthOfLongestSubstring("abcabcbb"));
    }
}
