import java.util.Scanner;
public class ra_4_reverse_array {
    public static void reverse(int [] arr){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int temp = arr[start];
            arr[start++] = arr[end];                             //by useing index
            arr[end--] = temp;
        }
        System.out.println("Reversed array is: ");
        for(int a:arr){
            System.out.print(a + " ");
        }
    }
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
        reverse(arr);
        /*
        System.out.println("Reversed array is: ");
        for(int i = n-1; i >=0; i--){                           //by conventional methode
            System.out.print(arr[i] + " ");
        }*/
    }
}
