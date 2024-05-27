import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄 입력 처리: 원소의 개수 N
        int N = sc.nextInt();

        // 두 번째 줄 입력 처리: N개의 정수
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        // 최솟값 찾기
        int minValue = numbers[0];
        for (int i = 1; i < N; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }

        // 최솟값을 갖는 원소의 개수 찾기
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (numbers[i] == minValue) {
                count++;
            }
        }

        // 결과 출력: 최솟값과 그 값에 해당하는 원소의 개수
        System.out.println(minValue + " " + count);

        sc.close();
    }
}