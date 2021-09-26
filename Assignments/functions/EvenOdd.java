package kunalwstDSA.functionsAssignment;

public class EvenOdd {
    public static void main(String[] args) {
        // Define a program to find out whether a given number is even or odd.

        System.out.println(OddEven(562));
    }
    static String OddEven(int n) {

        if(n % 2 == 0) {
            return "even";
        } else {
            return "Odd";
        }
    }
}

