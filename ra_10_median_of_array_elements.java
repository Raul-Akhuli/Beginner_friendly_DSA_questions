import java.util.Scanner;
import java.util.Arrays;
public class ra_10_median_of_array_elements {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        String[] stringArray = inputLine.split(" ");
        int n = stringArray.length;

        int[] intArray = new int[n];
        for(int i = 0; i < n; i++){
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        Arrays.sort(intArray);
        double median = 0.0;
        if(n %2 == 0){
            median = (double) (intArray[(n/2) -1] + intArray[n/2]) / 2;
        }
        else{
            median = intArray[(n/2)];
        }
        System.out.println("median is: " + median);
    }
}
