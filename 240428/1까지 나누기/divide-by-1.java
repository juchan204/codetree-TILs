import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 사용자로부터 정수 n 입력 받기
        int cnt = 0; // 나눗셈 횟수를 세기 위한 변수 초기화

        for (int i = 1; n > 1; i++) {
            n = n / i; // n을 i로 나누고 결과를 n에 저장
            cnt++; // 나눗셈 횟수 증가
        }

        System.out.println(cnt); // 나눗셈 횟수 출력
    }
}