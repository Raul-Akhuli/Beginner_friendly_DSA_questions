import java.util.Scanner;
public class max_element_in_array {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc. nextInt();
        System.out.println("Enter each element of an array: ");
        int [] arr = new int[n];
        int maxval = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        System.out.println("Maximum element is: " + maxval);

    }
}
