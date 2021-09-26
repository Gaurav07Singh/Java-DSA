package kunalwstDSA.functionsAssignment;

import java.util.Scanner;

public class ReturnProduct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Define a method that returns the product of two numbers entered by user .

        int a = sc.nextInt() , b = sc.nextInt();
        System.out.println(product(a  , b));

    }
    static int product(int a , int b) {
        return a*b;
    }
}
