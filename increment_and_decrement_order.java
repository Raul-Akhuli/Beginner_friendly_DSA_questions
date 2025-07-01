import java.util.Scanner;
import java.util.Arrays;
public class increment_and_decrement_order {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the array space separated: ");
        String inputLine = sc.nextLine();
        String[] stringArray = inputLine.split(" ");
        int n = stringArray.length;
        int[] intArray = new int[n];

        for(int i = 0; i < n; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

        Arrays.sort(intArray);
        System.out.println("incremented array: ");
        for(int i = 0; i < n; i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        System.out.println("decremented array: ");
        for(int i = n-1; i > 0; i--){
            System.out.print(intArray[i] + " ");
        }
    }
}
