package kunalwstDSA.assignment3;

public class ArmstrongNum {
    public static void main(String[] args) {

        /* Armstrong Numbers.
        153: 13 + 53 + 33 = 1 + 125+ 27 = 153
        125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
         */

        int n = 152;
        int temp = n;
        int r,sum = 0;
        while(n>0) {
            r = n % 10;
            n /= 10;
            sum = sum + r * r * r;
        }
        if(temp == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong number");
        }
    }
}
