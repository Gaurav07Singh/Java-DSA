package kunalwstDSA.functionsAssignment;
import java.util.Scanner;
public class AreaCircumference {
    public static void main(String[] args) {

       // Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of Circle");
        double a = sc.nextDouble();
        circumArea(a);


    }
    static void circumArea(double r){
        double area = Math.PI*r*r;
        double cir = Math.PI*2*r;
        System.out.println("Circumference of Circle : "+cir+" cm");
        System.out.println("Area of Circle : "+area+" cm²");
    }
}
