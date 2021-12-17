package kunalwstDSA.Recursion.eASY;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(12201));

    }
    static int rev2(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function(helper_function)
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }
    private static int helper(int n, int digits) {
        if(n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)Math.pow(10,digits-1) + helper(n/10 , digits-1);
    }
    static boolean palindrome(int n) {
        return n == rev2(n);
    }


}
