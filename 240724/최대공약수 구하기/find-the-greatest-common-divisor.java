import java.util.Scanner;

public class Main {
    // 최대공약수를 구하는 함수
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 두 정수를 입력 받음
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // 최대공약수를 계산하고 출력
        int result = gcd(n, m);
        System.out.println(result);

        scanner.close();
    }
}