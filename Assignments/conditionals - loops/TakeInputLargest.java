package kunalwstDSA.assignment3;

import java.util.Scanner;

public class TakeInputLargest {
    public static void main(String[] args) {

   //     Take integer inputs till the user enters 0 and print the largest number from all.
      Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        int large = 0;
        int counter = 0;
        while((n = sc.nextInt()) != 0) {
            n = sc.nextInt();
            large = sc.nextInt();

            if (n != 0)
                sum = n + sum;
            counter++;

            if (n > large)
                large = n;

        }

        System.out.println("The larger number is " + large);
    }
}
