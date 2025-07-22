import java.util.Scanner;
public class ra_28_prime_check_number {
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i*i <= num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check prime or not: ");
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println("this number is prime.");
        }
        else{
            System.out.println("this number is not prime.");
        }
    }
}
