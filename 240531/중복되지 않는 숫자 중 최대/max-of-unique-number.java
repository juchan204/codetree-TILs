import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 원소의 수 입력 받기
        int[] numbers = new int[N]; // 숫자들을 저장할 배열
        int[] freq = new int[1001]; // 각 숫자의 등장 횟수를 저장할 배열 (주어진 범위에 따라)

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt(); // 숫자 입력 받기
            freq[numbers[i]]++; // 해당 숫자의 등장 횟수 증가
        }

        int maxUnique = -1; // 중복되지 않는 숫자들 중 최댓값을 저장할 변수, 초기값은 -1

        for (int i = 0; i < N; i++) {
            if (freq[numbers[i]] == 1) { // 숫자가 중복되지 않는 경우
                maxUnique = Math.max(maxUnique, numbers[i]); // 현재 최댓값과 비교하여 더 큰 값을 저장
            }
        }

        System.out.println(maxUnique); // 결과 출력
    }
}