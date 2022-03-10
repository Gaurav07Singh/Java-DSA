package kunalwstDSA.maths_For_DSA;
import java.util.Scanner;
public class Pascals_Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        1
        1  1
        1  2  1
        1  3  3  1
        1  4  6  4  1
        1  5  10  10 5
        */

        int row = sc.nextInt();

        int ans = 1 << (row-1);
        System.out.println(ans);

    }
}
