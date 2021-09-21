package kunalwstDSA.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 256;
        arr[3] = 2516;
        arr[4] = 203;

//        System.out.println(Arrays.toString(arr));
//
//        System.out.println(arr[3]);
//
//        for(int num : arr) {
//            System.out.println(num);
//        }

        // Array of objects
        String[] str = new String[4];
        for(int i = 0 ; i< str.length ; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        // modify

        str[1]="Kunal";
        System.out.println(Arrays.toString(str));
    }
}
