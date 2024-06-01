import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // n년 간의 데이터 개수 입력 받기
        int n = scanner.nextInt();

        // 자동차 가격 정보를 저장할 배열 선언
        int[] prices = new int[n];

        // 자동차 가격 정보 입력 받기
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        // 최대 이익 계산
        int maxProfit = 0; // 최대 이익 초기화
        int minPrice = prices[0]; // 첫 번째 해의 가격을 최소 가격으로 초기 설정

        for (int i = 1; i < n; i++) {
            // 현재 가격에서 사고 이전의 최소 가격에 사서 팔았을 때의 이익 계산
            int profit = prices[i] - minPrice;

            // 최대 이익 갱신
            if (profit > maxProfit) {
                maxProfit = profit;
            }

            // 최소 구매 가격 갱신
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        // 최대 이익 출력
        System.out.println(maxProfit);

        scanner.close();
    }
}