package kunalwstDSA.assignment3;

public class Hcf {
    public static void main(String[] args) {

        // HCF Of Two Numbers Program
        System.out.println(gcd(15,25));
    }
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a == b)
            return a;
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
}
