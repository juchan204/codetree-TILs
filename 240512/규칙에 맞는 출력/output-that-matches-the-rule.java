import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = n-i; j <= n; j++) { // 해당 행에 출력할 숫자 계산 및 출력
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}