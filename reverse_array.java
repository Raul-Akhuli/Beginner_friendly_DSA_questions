import java.util.Scanner;
public class reverse_array {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the array value(space separated): ");

        String inputLine = sc.nextLine();
        String[] stringArray = inputLine.split(" ");
        int n = stringArray.length;

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stringArray[i]);
        }
        System.out.println("Reversed array is: ");
        for(int i = n-1; i >=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
