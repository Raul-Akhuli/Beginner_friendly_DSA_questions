import java.util.Scanner;
public class ra_26_palindrome_check_number {
    public static boolean isPalindrome(int num){
        int number = num;
        int reverse = 0;
        while(num > 0){
            int n = num %10;
            num = num /10;
            reverse = reverse *10 +n;
        }
        return number == reverse;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        if(isPalindrome(n)){
            System.out.println("\nIt is a palindrome number.");
        }
        else{
            System.out.println("It is not a palindrome number.");
        }
    }
}
