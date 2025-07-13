import java.util.Scanner;
import java.util.Arrays;
public class ra_24_binary_search_within_array {
    public static int binarySearch(int[] array, int n, int a){
        Arrays.sort(array);
        int start = 0;
        int end = n-1;
        int mid = (start+end)/2;
        while(start < end){
            if(a == array[mid]){
                return mid;
            }
            else if(a > array[mid]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return mid;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array element space separated: ");
        String inputLine = sc.nextLine();

        if(inputLine.isEmpty()){
            System.out.println("element gulo de ebaba.");
        }
        else{
            System.out.println("enter the element to search: ");
            int a = sc.nextInt();
            String[] stringArray = inputLine.split(" ");
            int n = stringArray.length;
            int[] intArray = new int[n];
            for(int i =0; i < n; i++){
                intArray[i] = Integer.parseInt(stringArray[i]);
            }
            int result = binarySearch(intArray,n,a);
            System.out.println("element present at an index of " + result);
        }
    }
}
