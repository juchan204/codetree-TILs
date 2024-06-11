import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄에 문자열 A 입력
        String A = sc.nextLine();

        // 두 번째 줄에 문자열 B 입력
        String B = sc.nextLine();

        // 두 문자열을 이어붙임
        String AB = A + B;
        String BA = B + A;

        // 두 이어붙인 문자열이 같은지 비교
        if (AB.equals(BA)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}