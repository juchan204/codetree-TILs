import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // 홀수 번째 위치에는 줄 번호(i)를, 짝수 번째 위치에는 n-(i-1)을 출력합니다.
                if (j % 2 == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(n - (i - 1));
                }
            }
            System.out.println(); // 한 줄이 끝나면 줄바꿈을 합니다.
        }
    }
}