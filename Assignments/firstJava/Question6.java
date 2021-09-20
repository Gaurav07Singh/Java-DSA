package kunalwstDSA.assignment1;
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       // Input currency in rupees and output in USD

        System.out.println("Enter amount in rupees");
        int cRupee = sc.nextInt();

        System.out.println(cRupee/75+"$");



    }
}
