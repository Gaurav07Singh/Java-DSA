package kunalwstDSA.functionsAssignment;
import java.util.Scanner;
public class PrintSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Write a program to print the sum of two numbers entered by user by defining your own method.
        System.out.println("Ener two numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(sum(x , y));

    }
    static int sum(int a, int b) {
        return a+b;
    }
}
