import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        // 출력
        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();
            
            // 홀수이면서 3의 배수인 경우 출력
            if (number % 2 != 0 && number % 3 == 0) {
                System.out.println(number);
            }
        }
    }
}