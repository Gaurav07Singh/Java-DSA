package kunalwstDSA.functionsAssignment;

public class PrimeFunction {
    public static void main(String[] args) {

        int a = 17;
        isPrime(a);
    }
    static void isPrime(int n) {
        for(int i = 1 ; i<= n ; i++) {
            if(n % i == 0) {
                System.out.println("not prime");
            }
        }
    }
}