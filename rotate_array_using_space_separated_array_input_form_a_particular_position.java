import java.util.Scanner;
public class rotate_array_using_space_separated_array_input_form_a_particular_position {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter space separated array: ");
        String inputLine = sc.nextLine();
        String[] stringArray = inputLine.split(" ");
        int n = stringArray.length;
        int[] intArray = new int[n];
        for(int i = 0; i < n; i++){
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        System.out.println("enter the position: ");
        int m = sc.nextInt();
        for(int i = m; i < n; i++){
            System.out.print(intArray[i] + " ");
        }
        for(int i = 0; i < m; i++){
            System.out.print(intArray[i] + " ");
        }
    }
}
