package kunalwstDSA.assignment1;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Write a program to print whether a number is even or odd, also take input.


        int n =sc.nextInt();

        if(n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }



    }
}
