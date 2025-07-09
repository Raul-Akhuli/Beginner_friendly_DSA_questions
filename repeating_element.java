import java.util.Scanner;
import java.util.HashSet;
public class repeating_element {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array space separated: ");
        String inputLine = sc.nextLine();

        if(inputLine.isEmpty()){
            System.out.println("value dibi to ebaba.");
        }
        else{
            String[] stringArray = inputLine.split(" ");
            int n = stringArray.length;

            int[] intArray = new int[n];
            for(int i = 0; i< n; i++){
                intArray[i] = Integer.parseInt(stringArray[i]);
            }
            boolean flag = false;
            HashSet<Integer> seen = new HashSet<>();
            for(int num:intArray){
                if(!seen.contains(num)){
                    seen.add(num);                               // Using HashSet instead of boolean array,
                }                                                // code is very flexible.
                else{
                    System.out.println(num + " ");
                }
            }
            if(!flag){
                System.out.println("no repeating character present.");
            }
        }
    }
}
