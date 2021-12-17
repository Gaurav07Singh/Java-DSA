package kunalwstDSA.Recursion.eASY;

public class Product {
    public static void main(String[] args) {

        System.out.println(product(1256));

    }
    static int product(int n) {
        if(n%10 == n) {
            return 1;
        }
        return (n % 10) * product(n / 10);
    }
}
