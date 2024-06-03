import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr2d = new int[n][n];
   
        for (int i = 0; i < n; i++) {
            int num = i + 1;
            for (int j = 0; j < n; j++) {
                arr2d[i][j] = num;
                num += n;
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}