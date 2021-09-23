package kunalwstDSA.searching_Algo;

public class FindMin {
    public static void main(String[] args) {

        int[] arr = {18,12,-7,3,14,28};

        System.out.println(min(arr));
    }

    // assume arr.length != 0
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}





