package ninja;
import java.util.Scanner;
public class Collatz_Conzature {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        while(true) {
            System.out.println(n + " ");

            if(n == 1) {
                break;
            } else if(n % 2 == 0) {
                n /= 2;
            } else {
                n = n*3+1;
            }

        }
        System.out.print(n+ " ");
    }
}
