package kunalwstDSA.assignment3;

public class CompountInterest {
    public static void main(String[] args) {

        // Calculate compound interest
        compountInterest(5000,8,2);

    }
    static void compountInterest(double principle , double rate , double time) {

        double CI = principle * (Math.pow((1 + rate / 100), time));
        System.out.println("Compound Interest is " + CI);
    }
}
