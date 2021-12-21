package kunalwstDSA.basic;
import java.util.Scanner;
public class TribonacciNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0 , b = 1 , c = 2;
        System.out.print(a+" ");
        System.out.print(b+" ");
        System.out.print(c+" ");
        for(int i = 0 ; i<n-3 ;i++) {
            int d = a+b+c;
            a =b;
            b = c;
            c = d;
            System.out.print(d+" ");
        }
    }
}
