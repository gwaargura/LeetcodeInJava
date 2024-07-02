package LeetCode.Medium;

/*
* STATUS: DONE
* OPTIMIZED: 5%
*
* Note: Can be optimized with using hashmap and convert characters to prime numbers -> get the product.
*
*
* */

import java.util.*;


public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        int count1 = 0;
        for (int i = 0; i < strs.length; i++) {
            String key = sortString(strs[i]);
            if (ans.isEmpty()) {
                ans.add(new ArrayList<>());
                ans.get(count1).add(key);
                ans.get(count1).add(strs[i]);
                count1++;
            } else {
                boolean found = false;
                for (int j = 0; j < count1; j++) {
                    if (ans.get(j).contains(key)) {
                        ans.get(j).add(strs[i]);
                        found = true;
                    }
                }
                if (!found) {
                    ans.add(new ArrayList<>());
                    ans.get(count1).add(key);
                    ans.get(count1).add(strs[i]);
                    count1++;
                }
            }
        }
        for(int i = 0; i < ans.size(); i++){
            if(ans.get(i).size() > 1){
                ans.get(i).remove(0);
            }
        }

        return ans;
    }

    public String sortString(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] > chars[j]) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        GroupAnagrams g = new GroupAnagrams();

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(g.groupAnagrams(strs));

        String[] strs1 = {""};
        System.out.println(g.groupAnagrams(strs1));

        String[] strs2 = {"a"};
        System.out.println(g.groupAnagrams(strs2));


//        String s = "abcbcad";
//        System.out.println(g.sortString(s));
    }

    /*

    // More optimized version, same approach

    public List<List<String>> groupAnagrams1(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();

        for(String s: strs){
            // made char array out of String
            char arr[]=s.toCharArray();
            Arrays.sort(arr);
            // made string again
            String sortedString=String.valueOf(arr);
            // if map don't have sorted string as key...we create new arraylist in it's value
            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }
            // adding string in the value
            map.get(sortedString).add(s);
        }
        // at last putting all values of a map inside a arrayList and returning
        return new ArrayList<>(map.values());
    }

     */

}
