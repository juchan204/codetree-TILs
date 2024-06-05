import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        
        int row = n-1, col = n-1; // 시작 위치: 오른쪽 아래 모서리
        int value = 1; // 채워넣을 값
        boolean up = true; // 위로 채우는지 여부
        
        while (value <= n * n) {
            grid[row][col] = value++; // 현재 위치에 값을 채움
            
            // 위로 채우는 경우
            if (up) {
                if (row == 0) { // 위쪽 끝에 도달하면
                    up = false; // 방향 전환
                    col--; // 왼쪽으로 이동
                } else {
                    row--; // 위로 이동
                }
            } else { // 아래로 채우는 경우
                if (row == n - 1) { // 아래쪽 끝에 도달하면
                    up = true; // 방향 전환
                    col--; // 왼쪽으로 이동
                } else {
                    row++; // 아래로 이동
                }
            }
        }
        
        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}