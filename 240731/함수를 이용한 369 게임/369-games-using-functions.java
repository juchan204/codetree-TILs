import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // 조건을 만족하는 숫자의 개수를 계산
        int count = countNumbersWith369OrMultipleOf3(a, b);

        // 결과 출력
        System.out.println(count);
    }

    public static int countNumbersWith369OrMultipleOf3(int a, int b) {
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (contains369(i) || isMultipleOf3(i)) {
                count++;
            }
        }

        return count;
    }

    public static boolean contains369(int number) {
        // 숫자에 3, 6, 9 중 하나라도 포함되어 있는지 확인
        String numStr = Integer.toString(number);
        return numStr.contains("3") || numStr.contains("6") || numStr.contains("9");
    }

    public static boolean isMultipleOf3(int number) {
        // 숫자가 3의 배수인지 확인
        return number % 3 == 0;
    }
}