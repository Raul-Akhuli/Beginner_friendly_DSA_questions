import java.util.Scanner;
public class rotate_array_by_from_a_particular_position {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the array size: ");
        int n = sc.nextInt();

        System.out.println("enter the elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the position: ");
        int m = sc.nextInt();
        for(int i = m; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i = 0; i < m; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
