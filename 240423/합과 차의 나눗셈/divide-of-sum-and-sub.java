import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // (a-b)가 0이 되는 경우를 방지
        if (a == b) {
            System.out.println("Error: Division by zero");
        } else {
            double result = (double) (a + b) / (a - b);
            System.out.printf("%.2f", result);
        }

        scanner.close();
    }
}