package kunalwstDSA.Recursion.Subset_String.Subset;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        System.out.println(subseqAsciiRet("","abc"));
        System.out.println(subseq2("" , "statue"));
    }
    static void subseq(String p ,  String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch ,up.substring(1)); // add it
        subseq(p,up.substring(1));        // ignore it
    }
    static ArrayList<String> subseq2(String p , String up) {

        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseq2(p+ch ,up.substring(1)); // add it
        ArrayList<String> right = subseq2(p,up.substring(1));        // ignore it.
        left.addAll(right);
        return left;
    }
    static void subseqAscii(String p ,  String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p+ch ,up.substring(1)); // add it
        subseqAscii(p,up.substring(1));        // ignore it
        subseqAscii(p+(ch+0),up.substring(1));
    }
    static ArrayList<String> subseqAsciiRet(String p ,  String up) {
        if(up.isEmpty()) {
          ArrayList<String> list = new ArrayList<>();
          list.add(p);
          return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqAsciiRet(p+ch,up.substring(1));
        ArrayList<String> second = subseqAsciiRet(p,up.substring(1));
        ArrayList<String> third = subseqAsciiRet(p+(ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;


    }
}
