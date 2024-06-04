import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr2d = new int[n][m];

        int num = 0;
        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                // 짝수 열: 위에서 아래로 채우기
                for (int i = 0; i < n; i++) {
                    arr2d[i][j] = num++;
                }
            } 
            else {
                // 홀수 열: 아래에서 위로 채우기
                for (int i = n - 1; i >= 0; i--) {
                    arr2d[i][j] = num++;
                }
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}