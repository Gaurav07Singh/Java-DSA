package kunalwstDSA.conditionals;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fruit = sc.next();

        switch(fruit) {
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "banana":
                System.out.println("a yellow fruit");
            default:
                System.out.println("please enter valid fruit");



        }

        // Optimized Syntax

//        switch(fruit) {
//            case "mango" -> System.out.println("King of Fruits");
//            case "Apple" -> System.out.println("A sweet red fruit"  );
//            case "banana" -> System.out.println("a Yellow fruit");
//            default -> System.out.println("Please Enter valid fruit");
//        }
    }
}
