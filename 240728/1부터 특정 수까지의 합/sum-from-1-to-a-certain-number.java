import java.util.Scanner;

public class Main {
    // 1부터 N까지의 합을 구한 후 10으로 나눈 몫을 반환하는 함수
    public static int sumDividedBy10(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum / 10; // 10으로 나눈 몫 반환
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 정수를 입력 받음
        int n = scanner.nextInt();

        // 함수를 호출하여 결과를 출력
        int result = sumDividedBy10(n);
        System.out.println(result);

        scanner.close();
    }
}