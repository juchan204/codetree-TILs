import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int perfectNumbersCount = 0;

        for (int i = a; i <= b; i++) {

            int cnt = 0;

            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    cnt += j; // 나누어 떨어지면 진약수이므로 합에 추가
                }
            }
            if (cnt == i) {
                perfectNumbersCount++;
            }
        }
        System.out.println(perfectNumbersCount); // 완전수의 개수를 출력
    }
}