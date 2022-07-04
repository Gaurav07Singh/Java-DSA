package kunalwstDSA.Recursion.String;

public class RemoveX {
    public static void main(String[] args) {

        
        // Q: Remove all 'x' from a String;

        String s = "abxbxxaccax";
        String ans = removeX(s);
        System.out.println(ans);

    }
    static String removeX(String str) {
        if(str.length() == 0) {
            return str;
        }
        String ans = "";
        if(str.charAt(0) != 'x') {
            ans = ans+str.charAt(0);
        }
        String smallAns = removeX(str.substring(1));
        return ans+smallAns;
    }
}


