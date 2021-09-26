package kunalwstDSA.functionsAssignment;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Write a program that will ask the user to enter his/her marks (out of 100)
        // . Define a method that will display grades according to the marks entered as below:

        System.out.print("Enter marks in percentage : ");
        int marksInPercent = sc.nextInt();
        gradeOf(marksInPercent);
    }
    static void gradeOf(int percent) {
        if(percent >=91  && percent <= 100 ) {
            System.out.println("AA");
        } else if(percent >=81 && percent <= 90) {
            System.out.println("AB");
        } else if(percent >=71 && percent <= 80) {
            System.out.println("BB");
        }else if(percent >=61 && percent <= 70) {
            System.out.println("BC");
        } else if(percent >=51 && percent <= 60) {
            System.out.println("CD");
        } else if(percent >=41 && percent <= 50) {
            System.out.println("DD");
        } else {
            System.out.println("Fail");
        }

    }
}
