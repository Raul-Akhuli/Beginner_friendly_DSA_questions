import java.util.Scanner;
public class range_sum_query {
    public static int getrangesum(int a, int b){
        int sum = 0;
        if(a < b){
            for(int i = a; i <= b; i++){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int [][] testcases = new int[T][2];

        for(int i = 0; i < T; i++){
            testcases[i][0] = sc.nextInt();
            testcases[i][1] = sc.nextInt();
        }
        for(int i = 0; i < T; i++){
            int a = testcases[i][0];
            int b = testcases[i][1];

            System.out.println(getrangesum(a, b));
        }

        sc.close();
    }
}
