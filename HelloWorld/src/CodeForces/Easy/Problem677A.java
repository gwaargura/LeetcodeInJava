package CodeForces.Easy;

    import java.util.Scanner;

    public class Problem677A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int min = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] > k){
                    min += 2;
                }
                else {
                    min += 1;
                }
            }
            System.out.println(min);
        }
    }
