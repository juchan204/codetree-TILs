import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a <= b && a <= c) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }

        // 두 번째 조건: 세 개의 수가 모두 같은지 확인
        if (a == b && b == c) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}