import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        if (isEven(n) && isSumMultipleOfFive(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // 짝수인지 확인하는 함수
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // 각 자리 숫자의 합이 5의 배수인지 확인하는 함수
    public static boolean isSumMultipleOfFive(int n) {
        int sum = (n / 10) + (n % 10);
        return sum % 5 == 0;
    }
}