package kunalwstDSA.string;

public class Performance {
    public static void main(String[] args) {

        String series = "";
        for(int i = 0 ; i<26 ; i++) {
            char ch = (char)('a'+i);
            System.out.println(ch);

            // a,ab,abc,abcd,abcde,abcdef,....................abcdefghijklmnopqrstuvwxyz.
            // Time Complexity : O(N^2)
        }
    }
}
