package kunalwstDSA.assignment3;

import java.util.Scanner;

public class PerimeterQues {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //Perimeter of Circle
        System.out.println("Enter radius of circle");
        int rad = sc.nextInt();
        System.out.println("The Perimeter of circle = " + 2 * 3.14 * rad);


        //--------------------------------------------------------------------------------------------------------------

        // Perimeter Of Equilateral Triangle

        System.out.println("Enter length of one side of Triangle");
        int side = sc.nextInt();
        System.out.println("The Perimeter of triangle = " + side * 3);

        //--------------------------------------------------------------------------------------------------------------

    }
}

