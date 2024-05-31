import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 원소의 수
        int[] numbers = new int[N]; // 숫자들을 저장할 배열

        // 숫자들 입력 받기
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        int endIndex = N; // 탐색을 마칠 인덱스
        while (endIndex > 0) {
            int maxIndex = 0; // 최댓값의 초기 위치
            int maxValue = numbers[0]; // 최댓값 초기화

            // 주어진 범위 내에서 최댓값의 위치를 찾기
            for (int i = 1; i < endIndex; i++) {
                if (numbers[i] > maxValue) {
                    maxValue = numbers[i];
                    maxIndex = i;
                }
            }

            // 최댓값의 위치 출력 (인덱스를 1부터 시작으로 변환)
            System.out.print((maxIndex + 1) + " ");
            endIndex = maxIndex; // 다음 탐색을 위해 탐색 끝 인덱스 업데이트
        }
    }
}