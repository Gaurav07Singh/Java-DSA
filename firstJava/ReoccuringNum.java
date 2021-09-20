package kunalwstDSA;

public class ReoccuringNum {
    public static void main(String[] args) {
        // How many time a digit is reoccuring in a number ??

        int n= 256622;
        int ans = 0;

        while(n>0) {
            int rem = n % 10;
            if(rem == 2) {
                ans++;
            }
            n/=10;
        }

        System.out.println(ans);
    }
}
