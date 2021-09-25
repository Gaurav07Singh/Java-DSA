package kunalwstDSA.assignment3;
import java.util.Scanner;

public class SubSumProduct {
    public static void main(String[] args) {

    //    Subtract the Product and Sum of Digits of an Integer

           Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int product = 1;

        while(n != 0) {
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;

        }
        System.out.print(product - sum);

    }
}



    
