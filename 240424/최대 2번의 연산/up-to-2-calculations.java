import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // a가 짝수일 때
        if (a % 2 == 0) {
            int b = a / 2;
            // b가 홀수이거나 짝수인 경우 모두 포함하여 처리
            System.out.println((b + 1) / 2);
        }
        // a가 홀수일 때
        if (a % 2 == 1) {
            int b = (a + 1) / 2;
            // b가 홀수이거나 짝수인 경우 모두 포함하여 처리
            System.out.println(b / 2);
        }

        
    }
}