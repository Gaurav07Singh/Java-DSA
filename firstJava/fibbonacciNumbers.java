package kunalwstDSA;
import java.util.Scanner;
public class fibbonacciNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int n = in.nextInt();
        System.out.println(a);
        System.out.println(b);

        for(int i = 2 ; i <n-2 ; i++) {
            int c =a + b;

            a = b;
            b = c;
            System.out.println(c);
        }
        System.out.println();

    }
}
