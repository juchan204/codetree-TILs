import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();
        char cnt = 'A';

        // 알파벳을 정사각형 모양으로 출력합니다.
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print(cnt);
                cnt++;
            }
            System.out.println();
        }
    }
}