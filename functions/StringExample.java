package kunalwstDSA.functions;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        String personalised = myGreet("Gaurav");
        System.out.println(personalised);

    }

     static String myGreet(String name) {
        String message = "hello " + name;
        return message;

    }

    static String greet() {
       String greeting = "how are you";
       return greeting;
    }
}
