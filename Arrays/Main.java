package kunalwstDSA.arrays;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int[] rnos = new int[5]; // declaration of array , ros is getting defined in the stack
        System.out.println(rnos); // initialisation: actually here object is being created in the heap memory .

        String[] arr = new String[4];
        System.out.println(arr[0]);

    }

}
