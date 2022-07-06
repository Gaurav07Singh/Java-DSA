package kunalwstDSA.Recursion.String;
import java.util.Scanner;
public class ReplaceChar {
    public static void main(String[] args) {

        // Change a specific character in an character array.

    Scanner sc = new Scanner(System.in);
        String input = "babbadb";
        char c1 = 'b';
        char c2 = 'x';
        System.out.println(replaceChar(input,c1,c2));

    }
    public static String replaceChar(String str , char c1 , char c2) {

        if(str.length() == 0) {
            return "";
        }
        char c;
        if(str.charAt(0) == c1) {
            c = c2;
        } else {
            c = str.charAt(0);
        }
        String ans = replaceChar(str.substring(1),c1,c2);
        return c+ans;
    }
}
