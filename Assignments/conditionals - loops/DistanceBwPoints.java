package kunalwstDSA.assignment3;

import java.util.Scanner;

public class DistanceBwPoints {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter point 1");
        double A = sc.nextInt();
        System.out.println("Enter point 2");
        double B= sc.nextInt();

        double dis = A-B;
        System.out.println("Distance Between these 2 points are : " + dis);

    }
}
