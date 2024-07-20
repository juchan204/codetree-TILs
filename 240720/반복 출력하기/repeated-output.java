import java.util.Scanner;

public class Main {
    // main 메서드: 프로그램의 진입점
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자로부터 입력을 받음
        Scanner scanner = new Scanner(System.in);

        // 정수 N을 입력받음
        int N = scanner.nextInt();

        // printLines 메서드를 호출하여 N번 출력함
        printLines(N);
    }

    // printLines 메서드: N번 "12345^&*()_"을 출력하는 메서드
    public static void printLines(int N) {
        // N번 반복하여 문자열을 출력함
        for (int i = 0; i < N; i++) {
            System.out.println("12345^&*()_");
        }
    }
}