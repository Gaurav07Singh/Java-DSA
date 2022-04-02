package kunalwstDSA.leetCode;

public class Reverses_Integer {
    public static void main(String[] args) {

        /*
            Given a signed 32-bit integer x, return x with its digits reversed.
             If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
         */

        System.out.println(reverse(256));

    }
    public static int reverse(int x) {
        long b = 0;
        while (x != 0) {
            b = b * 10 + x % 10;
            x /= 10;
        }
        if (b > Integer.MAX_VALUE || b < Integer.MIN_VALUE) {
            return 0;
        } else return (int) b;
    }
}
