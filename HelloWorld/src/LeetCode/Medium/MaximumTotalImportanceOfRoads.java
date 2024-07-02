package LeetCode.Medium;

import java.util.*;

public class MaximumTotalImportanceOfRoads {
    public long maximumImportance(int n, int[][] roads) {
        HashMap<Integer, Integer> roadsMap = new HashMap<>();
        long max = 0;
        for (int[] road : roads) {
            for (int i = 0; i < road.length; i++) {
                if(!roadsMap.containsKey(road[i])){
                    roadsMap.put(road[i], 1);
                }
                else if (roadsMap.containsKey(road[i])){
                    roadsMap.put(road[i], roadsMap.get(road[i]) + 1);
                }
            }
        }
        return getMax(roadsMap, n);
    }
    public static long getMax(HashMap<Integer, Integer> map, int n) {
        long max = 0;

        // Convert the map's entries to a list
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort the list based on values in ascending order
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // Iterate over the sorted list and calculate the sum
        for (Map.Entry<Integer, Integer> entry : list) {
            max += (long) entry.getValue() * (n);
            n--;
        }

        return max;
    }

    public static void main(String[] args) {
        MaximumTotalImportanceOfRoads mt = new MaximumTotalImportanceOfRoads();
        int [][] roads = new int[][]{{0,1},{1,2},{2,3},{0,2},{1,3},{2,4}};
        System.out.println(mt.maximumImportance(5, roads));

        int [][] roads1 = new int[][]{{3,2},{0,2}};
        System.out.println(mt.maximumImportance(4, roads1));
    }
}
