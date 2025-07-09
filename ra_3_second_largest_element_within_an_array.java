import java.util.Scanner;
public class ra_3_second_largest_element_within_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the space separated array value: ");
        String inputLine = sc.nextLine();
        String[] stringArray = inputLine.split(" ");
        int n = stringArray.length;

        if (n < 2) {
            System.out.println("array length must be greater than 2 ");
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stringArray[i]);
        }

        int largest = Integer.MIN_VALUE;
        int sec_largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                sec_largest = largest;
                largest = arr[i];
            } else if (arr[i] > sec_largest && arr[i] != largest) {
                sec_largest = arr[i];
            }
        }
        System.out.println("the second largest value is: " + sec_largest);
    }
}
