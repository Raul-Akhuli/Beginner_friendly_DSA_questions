import java.util.Scanner;
public class max_min_element_without_array {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of element: ");
        int n = sc.nextInt();
        System.out.println("enter the elements: ");

        int max = 0;
        int min = n;
        for(int i = 0; i < n; i++){
            int m = sc.nextInt();
            max = (max > m) ? max : m;
            min = (min > m) ? m : min;
        }
        System.out.println(max);
        System.out.println(min);
    }
}
