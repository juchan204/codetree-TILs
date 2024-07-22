import java.util.Scanner;

public class Main {
    // main 메서드: 프로그램의 진입점
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자로부터 입력을 받음
        Scanner scanner = new Scanner(System.in);

        // 정수 N을 입력받음
        int N = scanner.nextInt();

        // printSquare 메서드를 호출하여 N * N 크기의 정사각형을 출력함
        printSquare(N);
    }

    // printSquare 메서드: N * N 크기의 정사각형을 출력하는 메서드
    public static void printSquare(int N) {
        int currentNumber = 1; // 시작 숫자

        // N번 반복하여 행을 출력함
        for (int i = 0; i < N; i++) {
            // N번 반복하여 각 행에 숫자를 출력함
            for (int j = 0; j < N; j++) {
                // 현재 숫자를 출력하고 스페이스 추가
                System.out.print(currentNumber + " ");

                // 현재 숫자를 증가시키고 9를 넘어가면 1로 리셋
                currentNumber++;
                if (currentNumber > 9) {
                    currentNumber = 1;
                }
            }
            // 한 행을 출력한 후 줄바꿈
            System.out.println();
        }
    }
}