package kunalwstDSA.functions;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {

        int result = sum3(25 , 66);
        System.out.println(result);
    sum();
    }

    static int sum3(int a , int b) {
        return a + b;
    }
    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int b = sc.nextInt();
        int sum = a  + b;
        return sum;
    }
    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int b = sc.nextInt();
        int sum = a  + b;
        System.out.println(sum);

    }




}
