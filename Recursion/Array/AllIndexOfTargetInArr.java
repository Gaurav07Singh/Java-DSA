package kunalwstDSA.Recursion.array;

import java.util.ArrayList;

public class AllIndexOfTargetInArr {
    public static void main(String[] args) {

        int[] arr = { 1,2,5,6,2,2,9,3,74,2};
        findAllIndex(arr,2,0);
        System.out.println(list);

    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr , int target , int index) {
        if(index == arr.length) {
            return;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }
}
