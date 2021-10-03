package kunalwstDSA.assignment3;

public class PalindromeNum {
    public static void main(String[] args) {

        // Java program to find palindrome number

        palindrome(121);
    }
    static void  palindrome(int n) {
        int temp = n;
        int rev= 0;
        while(n>0) {
            int rem = n % 10;
            rev = rev*10+rem;
            n/=10;
        }
        if(temp == rev) {
            System.out.println("Palindrome");;
        } else {
            System.out.println("Not palindrome");;
        }

    }
}
