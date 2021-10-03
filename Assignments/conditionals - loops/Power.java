package kunalwstDSA.assignment3;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(5,4));

    }
    static int power(int base, int exponent) {
        int power = 1;                                             // power : 1
        for (int i = 1; i <= exponent; i++)
            power = power * base;                                 // power : 5 , 25 , 125 , 625
        return power;
    }
}

