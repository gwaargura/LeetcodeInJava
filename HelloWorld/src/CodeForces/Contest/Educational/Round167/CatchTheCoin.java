package CodeForces.Contest.Educational.Round167;
import java.util.Scanner;

public class CatchTheCoin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            if(isAbleToPick(x, y)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static boolean isAbleToPick(int x, int y) {
        if (y >= 0 ) {
            return true;
        } else {
            if (y == -1) return true;
            return false;
        }
    }
}
