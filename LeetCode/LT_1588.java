package kunalwstDSA.leetCode;

public class LT_1588 {
    public static void main(String[] args) {

        // Sum of All Odd Length Subarrays

        int[] arr = {1, 4, 2, 5, 3};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {

                    if ((i + j) % 2 == 0) {
                        sum += arr[k];
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
