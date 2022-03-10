package kunalwstDSA.maths_For_DSA;

public class PowerOfTwo {
    public static void main(String[] args) {


        // you are given a number . Find out if its power of 2 or not.


        int n = 22;

       boolean ans = (n & (n-1))== 0;
        System.out.println(ans);
    }
}
