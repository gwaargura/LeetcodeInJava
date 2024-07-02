package LeetCode.Easy;

import java.util.Arrays;

/*
 * STATUS: DONE
 * OPTIMIZED: 75%
 * DIFFICULTY: EASY
 *
 * DESCRIPTION:
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * Link: https://leetcode.com/problems/longest-common-prefix
 *
 */
class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String[] common = new String[strs[0].length()];

        for (int i = 1; i <= common.length; i++) {
            common[i - 1] = strs[0].substring(0, i);
        }

        String[] commonLength = new String[strs.length];
        Arrays.fill(commonLength, "");
        int k = 0;
        for (String s : common) {
            if (s != "") {
                boolean added = true;
                String add = "";
                for (int j = 1; j < strs.length; j++) {
                    k = j;
                    if(!strs[j].startsWith(s)) {
                        added = false;
                        break;
                    }
                }
                if(added){
                    add = s;
                    commonLength[k] = add;
                }
            }
        }
        int index = 0;
        int length1 = Integer.MIN_VALUE;
        for (int i = 0; i < commonLength.length; i++) {
            if (commonLength[i].length() > length1) {
                length1 = commonLength[i].length();
                index = i;
            }
        }
        return commonLength[index];
    }

    //SLOWER VERSION
//    public static String longestCommonPrefix(String[] strs) {
//        String output = "";
//        int k = 0;
//        for (int i = 1; i <= strs[0].length(); i++) {
//            int length = 0;
//            String temp = strs[0].substring(0, i);
//            if (!temp.isBlank()) {
//                boolean added = true;
//                for (int j = 1; j < strs.length; j++) {
//                    if (!strs[j].startsWith(temp)) {
//                        added = false;
//                        break;
//                    }
//                }
//                if (added && temp.length() >= k) {
//                    k = temp.length();
//                    output = strs[0].substring(0, i);
//                }
//            }
//        }
//        return output;
//    }

    public static void main(String[] args) {
        String output = longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        String output1 = longestCommonPrefix(new String[]{"c", "acc", "ccc"});
        String output2 = longestCommonPrefix(new String[]{"a", "a", "a"});
        System.out.println(output);
        System.out.println(output1);
        System.out.println(output2);
    }

}

