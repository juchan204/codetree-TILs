import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int startNumber = 11;
        
        // n * n 정사각형 출력
        for (int i = 0; i < n; i++) {
            int number = startNumber + 2 * i; // 각 행의 시작 숫자 조정
            for (int j = 0; j < n; j++) {
                System.out.print(number + " ");
                number += 2; // 다음 홀수로 증가
            }
            System.out.println(); // 다음 행으로 이동
        }
        
    }
}