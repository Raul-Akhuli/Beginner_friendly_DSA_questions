import java.util.Scanner;
public class product_of_array_except_self_leetcode {
    public static void product(int[] array, int n){
        /*int[] leftArray = new int[n];
        int[] rightArray = new int[n];
        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            if(i == 0){
                leftArray[i] = 1;
            }
            else{
                leftArray[i] = array[i-1] * leftArray[i-1];
            }                                                    //time and space complexity high.
        }
        for(int i = n-1; i >= 0; i--){
            if(i == (n-1)){
                rightArray[i] = 1;
            }
            else{
                rightArray[i] = array[i+1] * rightArray[i+1];
            }
        }

        for(int i = 0; i < n; i++){
            result[i] = leftArray[i] * rightArray[i];
            System.out.print(result[i] + " ");
        }

         */
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = array[i - 1] * result[i - 1];
        }


        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= right;
            right *= array[i];
        }

        for(int val: result){
            System.out.print(val + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element of an array space separated: ");
        String inputLine = sc.nextLine().trim();


        if(inputLine.isEmpty()){
            System.out.println("value to dibi ebaba.");
        }
        else{
            String[] stringArray = inputLine.split("\\s+");
            int n = stringArray.length;
            int intArray[] = new int[n];

            try{
                for(int i = 0; i < n; i++){
                    intArray[i] = Integer.parseInt(stringArray[i]);
                }
                product(intArray,n);
            }catch(NumberFormatException e){
                System.out.println("Invalid input. please enter integers only.");
            }
        }
    }
}
