package kunalwstDSA.assignment1;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //    Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

        System.out.println("Enter two number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        System.out.println("Enter Operator");
        char op=sc.next().trim().charAt(0);

        if (op == '+') {
            ans = a + b;


        }
        if (op == '-') {
            ans = a - b;

        }
        if(op == '*') {
            ans = a * b;
        }
        if(op == '/') {
            if(a!=0) {
                ans = a / b;
            }
        }
        else if(op == 'x' || op == 'X') {
        } else {
            System.out.println("Invalid Operation");
        }
    }
}
