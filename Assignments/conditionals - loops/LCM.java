package kunalwstDSA.assignment3;

public class LCM {
    public static void main(String[] args) {
        // Lcm of 2 Numbers

        int a = 12, b = 9, gcd = 1;
        for(int i = 1; i <= a && i <= b; ++i) {

            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        int lcm = (a * b) / gcd;
        System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);
    }
}


