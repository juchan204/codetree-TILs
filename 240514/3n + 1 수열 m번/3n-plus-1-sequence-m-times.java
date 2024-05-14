import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 입력 받을 숫자의 개수

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            int cnt = 0;
            int sum = a;

            // sum이 1이 될 때까지 반복
            while (sum != 1) {
                if (sum % 2 == 1) { // 홀수인 경우
                    sum = sum * 3 + 1;
                } 
                else { // 짝수인 경우
                    sum = sum / 2;
                }
                cnt++; // 연산 횟수 증가
            }

            System.out.println(cnt); // 연산 횟수 출력
        }
    }
}