import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 숫자의 개수 n 입력 받기
        int n = scanner.nextInt();

        // 숫자를 저장할 배열 선언
        int[] numbers = new int[n];

        // 숫자 입력 받기
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 최소 차이 초기화 (충분히 큰 값으로 설정)
        int minDifference = Integer.MAX_VALUE;

        // 오름차순으로 주어졌으므로 인접한 두 숫자의 차이를 계산하여 최소 차이를 찾음
        for (int i = 1; i < n; i++) {
            int difference = numbers[i] - numbers[i - 1];
            if (difference < minDifference) {
                minDifference = difference;
            }
        }

        // 최소 차이 출력
        System.out.println(minDifference);

        scanner.close();
    }
}