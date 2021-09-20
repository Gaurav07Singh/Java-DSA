package kunalwstDSA.assignment1;
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Take 2 numbers as input and print the largest number.

        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = Math.max(a , b);
        System.out.println(ans +" is greater number ");

    }
}
