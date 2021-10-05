package kunalwstDSA.assignment3;

public class VowelConsonents {
    public static void main(String[] args) {

        // Java Program Vowel Or Consonant

        charact('E');
        charact('z');

    }
    static void charact(char ch) {
        if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U' ) {
            System.out.println("Vowel");
        } else {
            System.out.println("consonent");
        }
    }
}
