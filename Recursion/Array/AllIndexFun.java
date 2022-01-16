package kunalwstDSA.Recursion.array;

import java.util.ArrayList;

public class AllIndexFun {
    public static void main(String[] args) {

        // Goal : Return the lit but don't take it in the argument.
        int[] arr = {1,2,3,4,4,8};
        System.out.println(findAllIndex(arr,4,0));
    }
    static ArrayList<Integer> findAllIndex(int[] arr , int target , int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length) {
            return list;
        }
        // this will contain answer for that function call only
        if(arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr, target ,index + 1);
        list.addAll(ansFromBelowCalls);
       return list;
    }
}