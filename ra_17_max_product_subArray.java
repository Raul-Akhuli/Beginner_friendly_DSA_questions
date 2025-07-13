import java.util.Scanner;
public class ra_17_max_product_subArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements space separated: ");
        String inputLine = sc.nextLine();

        if(inputLine.isEmpty()){
            System.out.println("value gulo dibi to ebaba");
        }
        else{
            String[] stringArray = inputLine.split(" ");
            int n = stringArray.length;
            int[] intArray = new int[n];
            for(int i = 0; i < n; i++){
                intArray[i] = Integer.parseInt(stringArray[i]);
            }
            int maxproduct = Integer.MIN_VALUE;
            int a = 0;
            int b = 1;
            for(int i = 0; i < n; i++){
                for(int j = i+1; j < n; j++){
                    int product = intArray[i] * intArray[j];
                    if(product > maxproduct){
                        maxproduct = product;
                        a = i;
                        b = j;
                    }
                }
            }
            System.out.println("max product subarray(contain 2 element): " + intArray[a] + " " + intArray[b]);
            System.out.println("product is: " + maxproduct);
        }
    }
}
