package kunalwstDSA.assignment3;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        if(n == 1) {
            return 1;
        }
        int factorial = 1;
        for(int i = 1 ; i<= n ; i++) {
            factorial = factorial*i;
        }
        return factorial;
    }

}
