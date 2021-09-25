package kunalwstDSA.assignment3;

import java.util.Scanner;

public class TakeInput0Sum {
    public static void main(String[] args) {

       // Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while( n != 0) {
            n = sc.nextInt();
            sum = sum + n;

        }
        System.out.println(sum);
    }
}
