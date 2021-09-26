package kunalwstDSA.functionsAssignment;

public class SumNnaturalNums {
    public static void main(String[] args) {
        // Write a function that returns the sum of first n natural numbers.
        System.out.println("Enter number");
        int n = 15;
        System.out.println(sum(n));
    }
    static int sum(int n) {
        int sum = 0;
        for(int i = 1 ; i<= n ;i++) {
            sum =sum + i;
        }
        return sum;
    }
}
