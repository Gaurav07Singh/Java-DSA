package kunalwstDSA.assignment3;

import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Fibbonacci Numbers

        int a = 0;
        int b = 1;
        int n = sc.nextInt();

        System.out.print(a+" ");
        System.out.print(b+" ");

        for(int i = 2 ; i<n; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
        System.out.println();

    }
}
