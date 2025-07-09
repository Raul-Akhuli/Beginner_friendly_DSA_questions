import java.util.Scanner;
public class ra_13_add_element_within_an_array {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements in space separated: ");
        String inputLine = sc.nextLine();

        String[] stringArray = inputLine.split(" ");
        int n = stringArray.length;
        int[] intArray = new int[n];
        System.out.println("elements are: ");
        for(int i = 0; i < n; i++){
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        for(int i = 0; i < n; i++){
            System.out.println(intArray[i]);
        }

        System.out.println();

        System.out.print("press 1 if you want to add another element: ");
        int choice = sc.nextInt();

        System.out.println();

        if(choice == 1){
            System.out.print("enter the element you want to add: ");
            int element = sc.nextInt();
            int[] intnewArray = new int[n+1];
            for(int i = 0; i < n; i++){
                intnewArray[i] = intArray[i];
            }
            intnewArray[n] = element;
            System.out.println("modified array: ");
            for(int i = 0; i <= n; i++){
                System.out.print(intnewArray[i] + " ");
            }
        }

    }
}
