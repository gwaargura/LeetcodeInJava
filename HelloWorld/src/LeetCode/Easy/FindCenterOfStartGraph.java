package LeetCode.Easy;

/*
*
* Link: https://leetcode.com/problems/find-center-of-star-graph
*
* */

public class FindCenterOfStartGraph {
    public int findCenter(int[][] edges) {
        int count1 = 0;
        int count2 = 0;
        int numb1 = edges[0][0];
        int numb2 = edges[0][1];
        for(int[] edge : edges) {
            for(int v : edge) {
                if(v == numb1) {
                    count1++;
                }
                if(v == numb2){
                    count2++;
                }
            }
        }
        return (count1 > count2) ? numb1 : numb2;
    }
    public static void main(String[] args) {
        FindCenterOfStartGraph findCenterOfStartGraph = new FindCenterOfStartGraph();
        int[][] edges = new int[][]{{1,2},{2,1},{2,1}};
        System.out.println(findCenterOfStartGraph.findCenter(edges));
    }
}
