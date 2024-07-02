package LeetCode.Easy;

/*
*
* Link: https://leetcode.com/problems/three-consecutive-odds
* */
public class ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 0; i < arr.length - 2; i++) {
            if(arr[i] % 2 != 0) {
                i++;
                if(arr[i] % 2 != 0){
                    i++;
                    if(arr[i] % 2 != 0){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ThreeConsecutiveOdds t = new ThreeConsecutiveOdds();
        int[] arr = {1,2,3,4,5,6,7,7,9};
        System.out.println(t.threeConsecutiveOdds(arr));
    }
}
