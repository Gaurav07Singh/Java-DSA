package kunalwstDSA.array_Assignment;

public class Pangram {
    public static void main(String[] args) {

        boolean ans = checkIfPangram("qwertyuiopasdfghjklzxcvbnm");
        System.out.println(ans);
    }

        static boolean checkIfPangram(String sentence) {
            if(sentence.length()<26)
                return false;
            for(char i='a';i<='z';i++){
                if(sentence.indexOf(i)==-1)
                    return false;
            }
            return true;
        }
    }
