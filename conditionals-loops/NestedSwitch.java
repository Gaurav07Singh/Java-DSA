package kunalwstDSA.conditionals;
import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int empId = sc.nextInt();
        String department = sc.next();
        switch (empId) {
            case 1 -> System.out.println("Kunal");
            case 2 -> System.out.println("Rahul");
            case 3 -> {
                System.out.println("Emp num 3");
                switch (department) {
                    case "It":
                        System.out.println("It Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpId");
        }
    }
}
