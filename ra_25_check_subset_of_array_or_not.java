import java.util.Scanner;
public class ra_25_check_subset_of_array_or_not {
    public static boolean isSubset(int[] mainArray, int[] checkArray){
        if(checkArray.length == 0){
            return true;                             //An empty array always a subarray.
        }
        if(checkArray.length > mainArray.length){
            return false;
        }
        for(int checkElement : checkArray){
            boolean found = false;
            for(int mainElement : mainArray){
                if(checkElement == mainElement){
                    found = true;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the array space separated: ");
        String inputLine = sc.nextLine();
        System.out.println("enter the set to check if it is subset or not space separated: ");
        String inputCheck = sc.nextLine();

        if(inputLine.isEmpty() || inputCheck.isEmpty()){
            System.out.println("re value to dibi ebeba.");
        }
        else{
            String[] stringArray = inputLine.split(" ");
            String[] stringCheck = inputCheck.split(" ");

            int n = stringArray.length;
            int m = stringCheck.length;

            int[] intArray = new int [n];
            int[] checkArray = new int[m];

            for(int i = 0; i < n; i++){
                intArray[i] = Integer.parseInt(stringArray[i]);
            }
            for(int i = 0; i < m; i++){
                checkArray[i] = Integer.parseInt(stringCheck[i]);
            }

            if(isSubset(intArray, checkArray)){
                System.out.println("It is a subset.");
            }
            else{
                System.out.println("It is not a subset.");
            }
        }
    }
}
