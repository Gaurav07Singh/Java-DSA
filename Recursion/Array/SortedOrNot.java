package kunalwstDSA.Recursion.array;

public class SortedOrNot {
    public static void main(String[] args) {

        int[] arr = {1,5,9,11,15,19,22,29,30,70};
        System.out.println(sortedArray(arr, 0));


    }
    static boolean sortedArray(int[] arr , int index) {
        // base condition
        if(index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index+1] && sortedArray(arr, index+1);

    }
}
