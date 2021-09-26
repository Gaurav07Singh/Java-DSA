package kunalwstDSA.functionsAssignment;
import java.util.Scanner;
public class FactorialFun {
    public static void main(String[] args) {
        //Write a program to print the factorial of a number by defining a method named 'Factorial'.
        // Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n= sc.nextInt();

        System.out.println(factorial(n));

    }
    static int factorial(int n) {
        int factorial = 1;

        for(int i = 1 ; i<=n;i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
