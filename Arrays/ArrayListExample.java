package kunalwstDSA.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(57);
        list.add(48);
        list.add(56);
        list.add(256);
        list.add(8);
        list.add(856);
        list.add(23);
        list.add(896);
        list.add(89);
        list.add(123);

//        System.out.println(list.contains(896));
//        System.out.println(list.remove(5));;
//        System.out.println(list);

        //input
        for(int i = 0 ; i<5 ; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);

        // get item at any index
        for(int i = 0 ; i< 5 ; i++) {
            System.out.println(list.get(i));

        }
        System.out.println(list);
    }
}
