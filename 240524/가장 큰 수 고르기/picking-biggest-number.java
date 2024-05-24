import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10개의 정수 입력 처리
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        // 가장 큰 수 찾기
        int maxNumber = numbers[0];
        for (int i = 1; i < 10; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        // 결과 출력
        System.out.println(maxNumber);

        sc.close();
    }
}