import java.util.HashMap;
import java.util.Scanner;
public class calculate_frequency_of_each_element_in_array {
    public static void frequency_count(int [] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();                       //using HashMap
        for(int num:arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        System.out.print(freq);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        String [] stringArray = inputLine.split(" ");
        int n = stringArray.length;

        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stringArray[i]);
        }
        frequency_count(arr);
    }
}
