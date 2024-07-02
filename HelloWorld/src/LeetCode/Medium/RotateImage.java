package LeetCode.Medium;

/*
* STATUS: DONE
* OPTIMIZED: 100%
*
* Description:
* Given a matrix, rotate it 90 degrees, clock-wise
*
* Link: https://leetcode.com/problems/rotate-image
*
* */
public class RotateImage {
    public void rotate(int[][] matrix) {

        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j <= (matrix.length-1)/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }

    }

    public void print(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        int[][] image = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
//        rotateImage.rotate(image);

        int[][] matrix = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        rotateImage.rotate(matrix);
        rotateImage.print(matrix);
    }
}
