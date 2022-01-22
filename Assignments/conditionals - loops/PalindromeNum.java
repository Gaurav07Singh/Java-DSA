package kunalwstDSA.assignment3;

public class PalindromeNum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(isPalindrome(252));

    }
    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        else if (x == 0) {
            return true;
        }
        else if (x % 10 == 0) {
            return false;
        }

        int temp = x;
     int ans = 0;

     while(temp != 0){
         int rem = temp % 10;
         ans = ans * 10+  rem;
         temp /= 10;

     }
     if(x == ans){
         return true;
     } else {
         return false;
       }
    }   
    
}
