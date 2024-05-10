import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 n 값을 입력받음
        int n = sc.nextInt();

        int start = 1; // 시작 숫자

        for (int i = 1; i <= n; i++) { // n 줄을 위한 반복문
            int current = start; // 현재 줄에서의 숫자 시작점
            for (int j = 1; j <= n; j++) { // 각 줄에 n개의 숫자를 출력하기 위한 반복문
                System.out.print(current + " ");
                if (i % 2 == 1) { // 홀수 번째 줄인 경우
                    current += 1; // 숫자가 1씩 증가
                } else { // 짝수 번째 줄인 경우
                    current += 2; // 숫자가 2씩 증가
                }
            }
            System.out.println();
            if (i % 2 == 1) { // 다음 줄의 시작 숫자를 결정하기 위한 조건문
                start += n + 1; // 홀수 줄 다음에는 n만큼 증가
            } else {
                start += n + 2; // 짝수 줄 다음에는 n+2만큼 증가
            }
        
        }
    }
}