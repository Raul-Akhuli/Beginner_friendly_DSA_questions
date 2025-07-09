import java.util.Scanner;
public class ra_7_sum_of_elements_in_array {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter the array element space separated: ");
        String inputLine = sc.nextLine();
        String[] stringarray = inputLine.split(" ");
        int n = stringarray.length;

        int[] intarr = new int[n];
        for(int i = 0; i < n; i++){
            intarr[i] = Integer.parseInt(stringarray[i]);
            sum = sum +intarr[i];
        }
        System.out.println("Sum is: " + sum);
    }
}
