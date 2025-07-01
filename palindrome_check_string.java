import java.util.Scanner;
public class palindrome_check_string {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String name_original = sc.nextLine();


        // what if nonalphanumeric character present such as ^&* etc.
        String name_clean = name_original.replaceAll("[^a-zA-Z0-9]", "");
        String actual_name = name_clean.toLowerCase();

        int start =0;
        int end = actual_name.length()-1;
        boolean isPalindrome = true;
        while(start < end){
            if(actual_name.charAt(start) != actual_name.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome){
            System.out.println("this string is palindrome ");
        }
        else{
            System.out.println("this string is not palindrome ");
        }
    }
}
