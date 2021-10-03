package kunalwstDSA.assignment3;

public class AverageMarks {
    public static void main(String[] args) {

        // Calculate Average Marks
        int[] marks = {50,45,32,26,22};
        System.out.println(avMarks(marks));

    }
    static int avMarks(int[] marks) {
        int n = marks.length;
        int sum = 0;
        int ans = 0;

        for(int i = 0 ; i<n ; i++) {
            sum += marks[i];
        }
        ans = sum/n;
        return ans;
    }
}
