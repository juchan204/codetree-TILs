import java.util.Scanner;

public class Main {
    // main 메서드: 프로그램의 진입점
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자로부터 입력을 받음
        Scanner scanner = new Scanner(System.in);

        // 정수 n과 m을 입력받음
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // printRectangle 메서드를 호출하여 n * m 크기의 직사각형을 출력함
        printRectangle(n, m);
    }

    // printRectangle 메서드: n * m 크기의 직사각형을 출력하는 메서드
    public static void printRectangle(int n, int m) {
        // n번 반복하여 행을 출력함
        for (int i = 0; i < n; i++) {
            // m번 반복하여 각 행에 1을 출력함
            for (int j = 0; j < m; j++) {
                System.out.print("1");
            }
            // 한 행을 출력한 후 줄바꿈
            System.out.println();
        }
    }
}