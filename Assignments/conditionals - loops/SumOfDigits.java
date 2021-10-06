package kunalwstDSA.assignment3;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Sum of a digits of a number.
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int sum = 0;
        while(n >0) {
            int rem = n % 10;
            sum = sum + rem;
            n /=10;
        }
        System.out.println(sum);
    }
}
