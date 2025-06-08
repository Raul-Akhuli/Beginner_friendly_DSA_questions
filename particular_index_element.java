import java.util.Scanner;
public class particular_index_element {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of an array: ");

        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("ente the array elements(space separated): ");
        String inputLine = sc.nextLine();
        String[] StringArray = inputLine.split(" ");

        int[] intArray = new int[n];
        for(int i = 0; i < n; i++){
            intArray[i] = Integer.parseInt(StringArray[i]);
        }

        System.out.println("enter the index value: ");

        int m = sc.nextInt();
        System.out.println(intArray[m-1]);
    }
}
