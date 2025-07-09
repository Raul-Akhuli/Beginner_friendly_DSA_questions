import java.util.Scanner;
public class ra_3_second_smallest_element_within_an_array {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        String[] stringArray = inputLine.split(" ");

        int n = stringArray.length;
        if(n < 2){
            System.out.println("array length must be greater than 2 ");
        }

        int[] arr  = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stringArray[i]);
        }
        int smallest = Integer.MAX_VALUE;
        int sec_smallest = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] < smallest){
                sec_smallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < sec_smallest && arr[i] != smallest){
                sec_smallest = arr[i];
            }
        }
        System.out.println(sec_smallest);
    }
}
