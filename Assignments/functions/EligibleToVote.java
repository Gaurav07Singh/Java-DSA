package kunalwstDSA.functionsAssignment;

public class EligibleToVote {
    public static void main(String[] args) {

        // A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

        System.out.println(canVote(2));
    }
    static String canVote(int age) {
        if(age >= 18) {
            return "You are eligible to vote";
        } else {
            return "You are not eligible to vote";
        }

    }
}
