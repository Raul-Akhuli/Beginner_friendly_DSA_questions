import java.util.Scanner;
public class reverse_number {
    public static int reverseNumber(int num){
        int res = 0;
        int sign = num < 0 ? -1: 1;
        num = Math.abs(num);                               // behave like mod positive stay positive
        while(num > 0){                                    // negative changes to positive
            int n = num % 10;
            if(res > Integer.MAX_VALUE /10 || (res == Integer.MAX_VALUE /10 && n > 7)){
                return 0;                                                                      // this two condition for the big integer
            }                                                                                  // greater than 32-bit
            if(res < Integer.MIN_VALUE /10 || (res == Integer.MIN_VALUE /10 && n < -8)){
                return 0;
            }
            num = num/10;
            res = res * 10 + n;
        }
        return res * sign;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        System.out.println(reverseNumber(num));
    }
}
