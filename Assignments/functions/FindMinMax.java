package kunalwstDSA.functionsAssignment;

public class FindMinMax {
    public static void main(String[] args) {

        // Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

        int a = 589 , b = 663 , c = 85;
        System.out.println("Maximum number from the following numbers = " + max(a , b , c));
        System.out.println("Minimun number from the following numbers = " +min(a , b , c ));

    }
    static int max(int a , int b , int c) {
        int max = a;
        if(max < b) {
            max = b;
        }
        if(max < c) {
            max = c;
        }
        return max;

    }

    static int min(int a , int b , int c) {
        int min =a ;
        if(min > b) {
            min = b;
        }
        if(min > c) {
            min = c;
        }

        return min;

    }
}
