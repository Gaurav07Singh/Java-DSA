package kunalwstDSA.functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,5,6,58,965,12,4,3,6);

        multiple(2 ,3 , "Gaurav");

    }

    static void multiple(int a , int b , String ...v) {

    }
    static void fun(int ...v) {  // String ...v = Array of String .
        System.out.println(Arrays.toString(v));


    }
}
