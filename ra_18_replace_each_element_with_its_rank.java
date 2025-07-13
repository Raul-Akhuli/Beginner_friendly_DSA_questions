import java.util.Scanner;
import java.util.Arrays;
public class ra_18_replace_each_element_with_its_rank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array element space separated: ");
        String inputLine = sc.nextLine();
        if(inputLine.isEmpty()){
            System.out.println("value gulo dibi to ebaba.");
        }
        else{
            String[] stringArray = inputLine.split(" ");
            int n = stringArray.length;
            int[] intArray = new int [n];
            int [] toCheck = new int[n];
            for(int i = 0; i < n; i++){
                intArray[i] = Integer.parseInt(stringArray[i]);
                toCheck[i] = Integer.parseInt(stringArray[i]);
            }
            Arrays.sort(intArray);
            System.out.print("ranks are: ");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(intArray[i] == toCheck[j]){
                        System.out.print(j+1 + " ");
                    }
                }
            }
        }
    }
}
