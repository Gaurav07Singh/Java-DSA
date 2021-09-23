package kunalwstDSA.searching_Algo;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 25,44,63,25,63,55,22,30,789};
        System.out.println(linearSearch(arr , 63,1 , 5));
    }
    static int linearSearch(int[] arr , int num , int start ,int end) {
        if(arr.length == 0) {
            return -1;
        }
        // run for loop

        for(int i= start ; i<=end ; i++) {
            if(arr[i] == num) {
                return i;
            }
        }
        return -1;

    }
}
