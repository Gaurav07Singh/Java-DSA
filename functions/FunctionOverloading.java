package kunalwstDSA.functions;

public class FunctionOverloading {
    public static void main(String[] args) {

        // Function overloading takes place at compile time .

        fun(57);
        fun(55 , 63);
        fun("sdfj;ksj");
    }

    static void fun(int a , int b) {
        System.out.println(a+b);
    }

    static void fun(int a) {
        System.out.println(a);

    }
    static void fun(String name) {
        System.out.println(name);

    }
}
