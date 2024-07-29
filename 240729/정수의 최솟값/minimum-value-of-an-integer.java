import java.util.Scanner;

public class Main {
    // 세 정수의 최솟값을 구하는 함수
    public static int findMin(int a, int b, int c) {
        // Math.min을 이용하여 최솟값을 구함
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력을 받아서 a, b, c에 저장
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // 최솟값을 구하는 함수 호출
        int min = findMin(a, b, c);

        // 최솟값 출력
        System.out.println(min);

        scanner.close();
    }
}