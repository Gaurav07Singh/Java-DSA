package kunalwstDSA.assignment3;

import java.util.Scanner;

public class AreasQuestion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //--------------------------------------------------------------------------------------------------------------


        // Area of Circle
        System.out.println("Enter radius of circle");
        double radius = sc.nextInt();
        double areaO = (3.14 * radius* radius);
        System.out.println("Area of circle is "+ areaO);


        //--------------------------------------------------------------------------------------------------------------

        // Area of Triangle

        System.out.println("Enter base and height of Triangle");
        double b = sc.nextInt();
        double h = sc.nextInt();
        double areaTri = (b*h)/2;
        System.out.println("Area of triangle is "+areaTri);


        //--------------------------------------------------------------------------------------------------------------
        // Area of Rectangle
        System.out.println("Enter length and breadth of rectangle");
        double l = sc.nextInt();
        double base = sc.nextInt();
        double areaRec = l * b;
        System.out.println(areaRec);


    }
}
