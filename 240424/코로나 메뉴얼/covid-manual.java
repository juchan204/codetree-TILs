import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        char a_cold = sc.next().charAt(0);
        int a = sc.nextInt();
        char b_cold = sc.next().charAt(0);
        int b = sc.nextInt();
        char c_cold = sc.next().charAt(0);
        int c = sc.nextInt();

        // 열이 있는 사람 수와 37도 이상인 사람 수 세기
        int feverCount = 0;
        if (a_cold == 'Y' && a >= 37) feverCount++;
        if (b_cold == 'Y' && b >= 37) feverCount++;
        if (c_cold == 'Y' && c >= 37) feverCount++;

        // 출력
        if (feverCount >= 2) {
            System.out.println("E");
        } else if (feverCount == 1) {
            System.out.println("N");
        } else {
            // 아무도 열이 없거나 조건을 만족하지 않는 경우
            // 이 부분은 문제의 요구사항에 따라 다를 수 있으며, 필요에 따라 추가 또는 생략 가능
        }

    }
}