import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();

        // n칸의 정사각형에 올바른 숫자를 출력합니다.
        for(int i = 1; i <= n; i++) {
            for(int j = n; j > 0 ; j--) {
                System.out.print( i * j + " ");
            }
            System.out.println();
        }
    }
}