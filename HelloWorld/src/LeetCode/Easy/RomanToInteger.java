package LeetCode.Easy;

/*
*
* Link: https://leetcode.com/problems/roman-to-integer
*
* */


import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        char[] chars = {'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        int[] nums   = { 1 ,  5 ,  10,  50, 100, 500, 1000};

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], nums[i]);
        }

        char[] chars1 = s.toCharArray();

        int total = 0;

        for(int i = 0 ; i < chars1.length -1 ; i++){
            if(map.get(chars1[i]) < map.get(chars1[i+1])){
                total = total - map.get(chars1[i]);
            }
            else{
                total = total + map.get(chars1[i]);
            }
        }
        total = total + map.get(chars1[chars1.length-1]);

        return total;
    }
    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("III"));
    }
}
