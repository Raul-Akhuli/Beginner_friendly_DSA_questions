import java.util.Scanner;
public class space_separated_array_input {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter space separated value: ");
        String inputLine = sc.nextLine();
        String[] stringArray = inputLine.split(" ");

        int[] intArray = new int[stringArray.length];
        for(int i = 0; i < stringArray.length; i++){
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        System.out.println("Array: ");
        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
        //for(int value : intArray){
        //    System.out.print(value + " ");
        //}
    }
}
