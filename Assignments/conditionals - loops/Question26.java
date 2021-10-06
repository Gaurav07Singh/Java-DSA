package kunalwstDSA.assignment3;

import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {

        // Kunal is allowed to go out with his friends only on the even days of a given month.
        // Write a program to count the number of days he can go out in the month of August.
        Scanner sc = new Scanner(System.in);

        int date = sc.nextInt();

        if(date <= 0 || date > 31) {
            System.out.println("Please enter a valid date");
        } else {
            if (date % 2 == 0) {
                System.out.println("Kunal can go ");
            } else {
                System.out.println("Kunal can't");
            }
        }
    }
}
