package kunalwstDSA.Recursion.cn;

public class ReverseNumber {
    public static void main(String[] args) {

        System.out.println(revNum(205));

    }
    static int revNum(int n) {
        if(n == 0) { return n; }
        int rem = n%10;
        return rem*(int)(Math.log10(n)+1)+revNum(n/10);
    }
}
