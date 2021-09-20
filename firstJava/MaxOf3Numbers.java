package kunalwstDSA;
import java.util.Scanner;

public class MaxOf3Numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

       /* int max = Math.max(a , Math.max(b , c));
        System.out.println("The max of the following number is " + max);  */

        int max = a;
        if(max < b) {
            max = b;
        }
        if(max < c) {
            max = c;
        }
        System.out.println(max);
    }
}
