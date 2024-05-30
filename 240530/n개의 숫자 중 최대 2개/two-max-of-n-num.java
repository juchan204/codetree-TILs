import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 입력 받을 숫자의 개수
        int[] numbers = new int[n]; // 숫자를 저장할 배열

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt(); // 숫자 입력 받기
        }

        // 첫 번째로 큰 수와 두 번째로 큰 수를 찾기 위한 변수 초기화
        int maxNumber = numbers[0];
        int secondMaxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (numbers[i] >= maxNumber) {
                // 새로운 최댓값을 찾았을 때, 현재의 최댓값을 두 번째로 큰 수로 업데이트하고
                // 새로운 최댓값으로 업데이트
                secondMaxNumber = maxNumber;
                maxNumber = numbers[i];
            } else if (numbers[i] > secondMaxNumber && numbers[i] <= maxNumber) {
                // 새로운 두 번째로 큰 수를 찾았을 때 업데이트
                // 이 조건은 첫 번째로 큰 수와 동일한 값은 제외
                secondMaxNumber = numbers[i];
            }
        }

        // 첫 번째로 큰 수가 배열에 하나만 있을 때
        if (secondMaxNumber == Integer.MIN_VALUE) {
            secondMaxNumber = maxNumber; // 두 번째로 큰 수도 첫 번째로 큰 수와 동일
        }

        // 가장 큰 수와 두 번째로 큰 수 출력
        System.out.println(maxNumber + " " + secondMaxNumber);
    }
}