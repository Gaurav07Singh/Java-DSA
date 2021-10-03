package kunalwstDSA.assignment3;

public class ReverseOfString {
    public static void main(String[] args) {

        System.out.println(reverse("dsa"));

    }
   static String reverse(String a) {
        String b="";
        int n = a.length();
        for(int i = a.length()-1;i>=0;i--) {
            b+=a.charAt(i);
        }
        return(b);
    }

}
