package LeetCode.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < Math.pow(2, nums.length); i++) {
            String s = "";
            for(int j = 0; j < nums.length; j++) {
                s = s + nums[j];
            }


        }

        return res;
    }
}
