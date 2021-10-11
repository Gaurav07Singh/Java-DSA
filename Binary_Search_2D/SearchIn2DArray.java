package kunalwstDSA.arrays2D;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {1,5,8,9},
                {22,5,99,44},
                {56,89,22,63}
        };
        int target = 991;
        System.out.println(searchIn(arr, target));

    }
    static boolean searchIn(int[][] arr , int target) {
        int r = arr.length;
        int c = arr[0].length;

        for(int i = 0;i<r;i++) {
            for(int j = 0 ; j<c ;j++) {
                if(arr[i][j] == target) {
                    return true;

                }
            }
        }
       return false;
    }
}
