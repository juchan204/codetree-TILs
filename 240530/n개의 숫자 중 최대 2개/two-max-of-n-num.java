import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 입력 받을 숫자의 개수
        int[] numbers = new int[n]; // 숫자를 저장할 배열

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt(); // 숫자 입력 받기
        }

        // 배열을 내림차순으로 정렬
        Arrays.sort(numbers);

        // 가장 큰 수와 두 번째로 큰 수 출력
        System.out.println(numbers[n - 1] + " " + numbers[n - 2]);
    }
}