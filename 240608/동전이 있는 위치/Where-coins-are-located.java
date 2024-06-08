import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        int n = sc.nextInt();
        int[][] placed = new int[n][n];

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int r = sc.nextInt() - 1; // 배열 인덱스는 0부터 시작하므로 1을 빼줌
            int c = sc.nextInt() - 1;
            placed[r][c] = 1;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(placed[i][j] + " ");
            }
            System.out.println();
        }

    }
}