import java.util.Scanner;
public class making_triplets_equal {
    public static int getSteps(int a, int b, int c) {
        int count = 0;
        if(a == b || b == c){
            if(a == b && b == c){
                return 0;
            }
            else if(a == b){
                while(a != c){
                    a++;
                    c--;
                    count++;
                }
            }
            else return -1;
        }
        else return -1;
        if(count > 1){
            return count;
        }
        else return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // number of test cases
        int[][] testCases = new int[T][3];

        System.out.println("make sure they are Ascending order: ");
        // Read all test cases
        for (int i = 0; i < T; i++) {
            testCases[i][0] = sc.nextInt();
            testCases[i][1] = sc.nextInt();
            testCases[i][2] = sc.nextInt();
        }

        System.out.println("Output:");
        for (int i = 0; i < T; i++) {
            int a = testCases[i][0];
            int b = testCases[i][1];
            int c = testCases[i][2];

            System.out.println(getSteps(a, b, c));
        }

        sc.close();
    }
}
