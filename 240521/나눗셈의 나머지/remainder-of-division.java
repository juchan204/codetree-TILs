import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 나머지 등장 횟수를 저장할 Map
        Map<Integer, Integer> remainderCountMap = new HashMap<>();

        // 나눗셈을 반복하며 나머지 계산
        while (a > 1) {
            int remainder = a % b;
            a = a / b;

            // 나머지 등장 횟수 증가
            remainderCountMap.put(remainder, remainderCountMap.getOrDefault(remainder, 0) + 1);
        }

        // 각 나머지 등장 횟수의 제곱의 합 계산
        int sumOfSquares = 0;
        for (int count : remainderCountMap.values()) {
            sumOfSquares += count * count;
        }

        // 결과 출력
        System.out.println(sumOfSquares);
    }
}