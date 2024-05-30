import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // N개의 정수를 입력 받음
        int[] numbers = new int[n]; // N개의 정수를 저장할 배열

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt(); // 정수를 입력 받아 배열에 저장
        }

        // 가장 큰 수 찾기
        int maxNumber = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        // 두 번째로 큰 수 찾기
        // 가장 큰 수와 같을 수 있으므로 초기값은 Integer.MIN_VALUE
        int secondMaxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            // 현재 숫자가 maxNumber보다 작거나 같고, secondMaxNumber보다 클 경우 업데이트
            if (numbers[i] < maxNumber && numbers[i] > secondMaxNumber) {
                secondMaxNumber = numbers[i];
            }
        }

        // 첫 번째와 두 번째로 큰 수 출력
        System.out.println(maxNumber + " " + secondMaxNumber);
    }
}