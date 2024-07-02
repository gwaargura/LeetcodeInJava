package LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<>();

        int col = matrix[0].length;
        int row = matrix.length;
        if (row == 0) {
            return res;
        }
        if (row == 1) {
            res.add(matrix[0][0]);
            return res;
        }

        int n = 0;
        int m = col-1;
        int countRow = 0;
        int countCol = m;
        while( countRow <= row && countCol <= col){
            System.out.println("Count row: " + countRow);
            for(int i = countRow; i < col - 1; i++){
                System.out.println(matrix[n][i]);
                res.add(matrix[n][i]);
            }
            countRow++;
            n = row - n - 1;
            System.out.println("Count col: " + countCol);
            for(int i = countCol; i < row - 1; i++){
                System.out.println(matrix[i][m]);
                res.add(matrix[i][m]);
            }
            countCol++;
            m = col - m - 1;
        }
        return res;
    }
    public static void main(String[] args) {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(spiralMatrix.spiralOrder(matrix));
    }
}
