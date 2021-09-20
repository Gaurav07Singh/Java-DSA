package kunalwstDSA;
import java.util.Scanner;
public class CaseCheck {

    // A program to check whether a alphabet is in capital or small .

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        System.out.println(ch);

        if(ch >= 'a' && ch <= 'z') {
            System.out.println("Lower Case");
        } else {
            System.out.println("Upper Case");
        }
    }
}
