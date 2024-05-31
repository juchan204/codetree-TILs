import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 초기 최댓값과 최솟값 설정
        int maxUnder500 = Integer.MIN_VALUE;
        int minOver500 = Integer.MAX_VALUE;

        // 10개의 정수 입력 받기
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();

            // 500 미만의 수 중 가장 큰 수 찾기
            if (num < 500 && num > maxUnder500) {
                maxUnder500 = num;
            }

            // 500 초과의 수 중 가장 작은 수 찾기
            if (num > 500 && num < minOver500) {
                minOver500 = num;
            }
        }

        // 결과 출력
        System.out.println(maxUnder500 + " " + minOver500);

        scanner.close();
    }
}