package kunalwstDSA.assignment3;

import java.util.Scanner;

public class TakeInputTil0 {
    public static void main(String[] args) {

        // Take integer inputs till the user enters 0 .
        Scanner sc= new Scanner(System.in);

        int n;
        while((n = sc.nextInt()) != 0) {
            n = sc.nextInt();
        }
    }
}
