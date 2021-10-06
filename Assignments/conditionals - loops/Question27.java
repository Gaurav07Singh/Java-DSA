package kunalwstDSA.assignment3;

import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        // Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N)
        // entered by the user.
        // The list terminates when the user enters a zero.
        Scanner sc = new Scanner(System.in);
        long sum_n=0;
        long sum_e=0;
        long sum_o=0;
        System.out.println("Enter numbers:");
        int temp = sc.nextInt();
        while(temp!=0){
            if(temp<0) sum_n+=temp;
            if(temp>0){
                if(temp%2==0) sum_e+=temp;
                else sum_o+=temp;
            }
            temp = sc.nextInt();
        }
        System.out.println("Sum of Negative numbers : "+sum_n);
        System.out.println("Sum of Positive odd numbers : "+sum_o);
        System.out.println("Sum of Positive even number : "+sum_e);
    }
}
