import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 사용자로부터 n의 값을 입력받음

        for (int i = 0; i <= 2 * n - 1; i++) { // 총 2n-1줄로 구성된 패턴 생성
            if (i % 2 == 0) {
                // i가 짝수인 경우, 별의 개수는 1 + (i / 2)
                for (int j = 0; j < 1 + (i / 2); j++) {
                    System.out.print("* ");
                }
            }
            else {
                // i가 홀수인 경우, 별의 개수는 n - ((i - 1) / 2)
                for (int j = 0; j < n - ((i - 1) / 2); j++) {
                    System.out.print("* ");
                }
            }
            System.out.println(); // 현재 줄의 별 출력을 마친 후 다음 줄로 넘어감
        }
    }
}