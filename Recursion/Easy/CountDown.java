package kunalwstDSA.Recursion.cn;

public class CountDown {
    public static void main(String[] args) {

        countDown(5);

    }
    static void countDown(int n) {
        if(n == -1) {
            return;
        }
        System.out.println(n);
       countDown(--n);
    }
}
