import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        
        int value = 1;
        // 대각선의 수는 n + m - 1개입니다.
        for (int s = 0; s < n + m - 1; s++) {
            // 대각선 시작 지점을 결정합니다.
            int x = s < m ? 0 : s - m + 1;
            int y = s < m ? s : m - 1;
            
            while (x < n && y >= 0) {
                arr[x][y] = value;
                value++;
                x++;
                y--;
            }
        }
        
        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}