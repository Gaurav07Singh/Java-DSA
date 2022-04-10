package kunalwstDSA.leetCode;

public class LT_682 {
    public static void main(String[] args) {

        /*
        You are keeping score for a baseball game with strange rules. The game consists of several rounds, where the scores of past rounds may affect future rounds' scores.
        At the beginning of the game, you start with an empty record. You are given a list of strings ops, where ops[i] is the ith operation you must apply to the record and is one of the following:
        An integer x - Record a new score of x.
        "+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
        "D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score.
        "C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.
        Return the sum of all the scores on the record.
         */


        String[] str = {"5","2","C","D","+"};
        System.out.println(calPoints(str));

    }
    public static int calPoints(String[] ops) {

        int[]arr = new int[ops.length];
        int i=0;

        for(String s : ops){
            if(s.equals("C")){
                i--;
                arr[i]=0;
            }
            else if(s.equals("D")){
                arr[i]=2*arr[i-1];
                i++;
            }
            else if(s.equals("+")){
                arr[i]=arr[i-1]+arr[i-2];
                i++;
            }
            else{
                arr[i]=Integer.parseInt(s);
                i++;
            }
        }

        int result=0;
        for(int ii : arr){
            result+=ii;
            //System.out.println(ii);
        }
        return result;
    }
}
