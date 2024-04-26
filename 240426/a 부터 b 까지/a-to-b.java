import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a <= b) {
            System.out.print(a + " "); // 현재 숫자를 출력합니다.

            if (a % 2 == 0) { // 숫자가 짝수인 경우
                a += 3; // 3만큼 증가합니다.
            } else { // 숫자가 홀수인 경우
                a *= 2; // 2배가 됩니다.
            }
        }

    }
}