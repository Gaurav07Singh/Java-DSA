package kunalwstDSA.revision3;

import java.util.LinkedList;
import java.util.Arrays;

public class Exception_Handling {
    public static void main(String[] args) {


        try {
            int[] arr = new int[4];
            System.out.println(arr[3]);
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage() + " occured please check your code");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index should be in the range of 0 to n - 1");
        } finally {
            System.out.println("sorry for inconvinience");
        }
                            fun();
    }
    static void fun() {
        int a = 5;
        int b = 3;
        int c = a / b;

        System.out.println(c);
        boolean isDanger = true;
        if(isDanger) {
            throw new ArrayIndexOutOfBoundsException("Danger is out of bound");
        }
    }
}
