import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char c = sc.next().charAt(0);
        int n = sc.nextInt();
        

        if (c == 'A') {
            // 'A'를 입력받았을 때, 1부터 n까지 숫자를 증가시키며 출력합니다.
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        } else if (c == 'D') {
            // 'D'를 입력받았을 때, n부터 1까지 숫자를 감소시키며 출력합니다.
            // 여기서 i는 n에서 시작해서 1까지 감소해야 하므로 초기 조건, 조건식, 그리고 증감식을 수정해야 합니다.
            for (int i = n; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }

        
    }
}