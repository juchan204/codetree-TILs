import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력값 받기
        int n = scanner.nextInt();
        
        // 파스칼 삼각형 출력
        for (int i = 0; i < n; i++) {
            int number = 1; // 각 행의 첫 번째 숫자는 항상 1입니다.
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // 다음 숫자를 계산합니다.
            }
            System.out.println(); // 각 행을 출력한 후 줄 바꿈
        }

    }
}