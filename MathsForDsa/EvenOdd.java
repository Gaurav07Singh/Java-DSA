import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if((n&1) == 1) {
            System.out.println("odd");
        } else {
             System.out.println("even");
        }
    }
}
