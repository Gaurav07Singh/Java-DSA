package kunalwstDSA.assignment1;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
      //  Write a program to input principle, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount");
      double P = sc.nextInt();
        System.out.println("Enter Time in Years");
      double T = sc.nextInt();
        System.out.println("Enter Rate of Interest");
      double R = sc.nextInt();

      double simpleInterest = P * R * T;
        System.out.println("Simple Interest of given amount is " + simpleInterest);



    }
}
