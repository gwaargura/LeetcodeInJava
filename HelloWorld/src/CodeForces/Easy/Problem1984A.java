package CodeForces.Easy;

import java.util.Scanner;

public class Problem1984A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[50];
        int index = 0;
        while (sc.hasNextInt()) {
            array[index] = sc.nextInt();
            index++;
        }

        if (array[1] == array[index - 1]) {
            System.out.println("NO");
        }
        int range = array[index - 1] - array[0];
        if(range != 0){
            System.out.println("YES");
            for(int i = 0; i < index; i++){
                if( i == 1){
                    System.out.print("R");
                }
                else{
                    System.out.print("B");
                }
            }
        }
    }
}
