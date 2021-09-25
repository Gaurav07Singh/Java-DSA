package kunalwstDSA.assignment3;

import java.util.Scanner;

public class FactorsOfNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(int i = 1 ; i< n ;i++) {
            if(n % i == 0) {
                System.out.println(i);
            }
        }

    }
}
