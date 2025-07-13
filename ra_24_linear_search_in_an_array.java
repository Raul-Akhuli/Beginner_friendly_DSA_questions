import java.util.Scanner;
public class ra_24_linear_search_in_an_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the array element");
        String inputLine = sc.nextLine();


        boolean flag = false;

        if(inputLine.isEmpty()){
            System.out.println("array element gulo ke debe ebaba.");
        }
        else{
            System.out.println("enter the element for search: ");
            int a = sc.nextInt();

            String[] stringArray = inputLine.split(" ");
            int n = stringArray.length;
            int[] inputArray = new int[n];
            for(int i = 0; i < n; i++){
                inputArray[i] = Integer.parseInt(stringArray[i]);
                if(a == inputArray[i]){
                    System.out.println("value present at a index: " + i);
                    flag = true;
                }
            }
        }

        if(!flag){
            System.out.println("Oops! value not present within an array.");
        }
    }
}
