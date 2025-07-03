import java.util.Scanner;
public class remove_duplicate_from_a_array {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the aray elements space separated: ");
        String inputLine = sc.nextLine();

        if(inputLine.isEmpty()){
            System.out.println("no input provided.");
        }
        else{
            String[] stringArray = inputLine.split(" ");
            int n = stringArray.length;
            int[] intArray = new int[n];
            for(int i = 0; i < n; i++){
                intArray[i] = Integer.parseInt(stringArray[i]);
            }

            boolean[] check = new boolean[10000000];               // if you use 256 you can't work
            for(int i = 0; i < n; i++){                            // with the value grater than 256.
                if(!check[intArray[i]]){
                    System.out.print(intArray[i] + " ");
                    check[intArray[i]] = true;
                }
            }
        }
    }
}
