package kunalwstDSA.maths_For_DSA;

public class Number_Of_Digits {
    public static void main(String[] args) {

        int n = 34589;
        int b = 10;

        int ans = (int)(Math.log(n)/ Math.log(b)) + 1;
        System.out.println(ans);
    }
}
