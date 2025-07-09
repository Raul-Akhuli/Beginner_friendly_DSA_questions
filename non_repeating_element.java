import java.util.Scanner;
import java.util.HashSet;
public class non_repeating_element {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array value space separated: ");
        String inputLine = sc.nextLine();
        if(inputLine.isEmpty()){
            System.out.println("value gulo ke debe tor baba.");
        }
        else{
            String[] stringArray = inputLine.split(" ");
            int n = stringArray.length;
            int[] intArray = new int[n];
            for(int i = 0; i < n; i++){
                intArray[i] = Integer.parseInt(stringArray[i]);
            }
            HashSet<Integer> seen = new HashSet<>();
            for(int ch:intArray){
                if(!seen.contains(ch)){
                    System.out.println(ch + " ");
                    seen.add(ch);
                }
            }
        }
    }
}
