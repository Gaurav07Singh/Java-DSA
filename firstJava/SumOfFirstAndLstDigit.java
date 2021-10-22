package kunalwstDSA.basic;

import java.util.Scanner;

public class SumOfFirstAndLstDigit {
    public static void main(String[] args) {

        // Sum of first and last digit of a number.
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if(num < 0){
            num *= -1;
        }
        int first = num;

        if(num <=9 && num >= 0) {
            System.out.println(-1);
        } else {
            while (first > 9) {
                first = first / 10;
            }
            int last = num % 10;
            System.out.println(first + last);

        }

    }
}
