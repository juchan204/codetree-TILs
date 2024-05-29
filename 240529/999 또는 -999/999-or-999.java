import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE; // 가장 큰 숫자 초기화
        int minNumber = Integer.MAX_VALUE; // 가장 작은 숫자 초기화

        while (true) {
            int number = sc.nextInt();

            // 입력 종료 조건 검사
            if (number == 999 || number == -999) {
                break;
            }

            // 가장 큰 숫자 업데이트
            if (number > maxNumber) {
                maxNumber = number;
            }

            // 가장 작은 숫자 업데이트
            if (number < minNumber) {
                minNumber = number;
            }
        }

        // 결과 출력
        System.out.println(maxNumber + " " + minNumber);

        sc.close();
    }
}