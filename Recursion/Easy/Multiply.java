package kunalwstDSA.Recursion.cn;

public class Multiply {
    public static void main(String[] args) {

        System.out.println(multiply(15,4));
    }
    static int multiply(int n , int m) {
        if(m == 0) {
            return m;
        }
        return n+multiply(n,m-1);
    }
}
