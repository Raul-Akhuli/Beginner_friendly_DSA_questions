import java.util.Scanner;
public class average_of_all_element_in_array {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array element in space separated: ");
        String inputLine = sc.nextLine();

        if(inputLine.isEmpty()){
            System.out.println("no input provided.");
        }
        else{
            String[] stringArray = inputLine.split(" ");
            int total = 0;
            /*int n = stringArray.length;
              int[] intArray = new int[n];
              for(int i = 0; i < n; i++){
                  intArray[i] = Integer.parseInt(stringArray[i]);       // conventional method
                  total = total + intArray[i];
              }*/
            for(String s: stringArray){
                total += Integer.parseInt(s);
            }

            System.out.println("average is: " + (double)total/stringArray.length);
        }
    }
}
