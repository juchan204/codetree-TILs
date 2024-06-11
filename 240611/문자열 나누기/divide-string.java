import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄에 숫자로만 이루어진 문자열의 개수 n 입력
        int n = sc.nextInt();
        sc.nextLine();  // 개행 문자 소비

        // 두 번째 줄에 숫자로 이루어진 n개의 문자열 입력
        String[] numbers = sc.nextLine().split(" ");

        // 모든 문자열을 하나의 문자열로 합침
        StringBuilder combined = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            combined.append(numbers[i]);
        }

        // 합쳐진 문자열을 5개씩 잘라서 출력
        String combinedStr = combined.toString();
        int length = combinedStr.length();
        for (int i = 0; i < length; i += 5) {
            if (i + 5 <= length) {
                System.out.println(combinedStr.substring(i, i + 5));
            } else {
                System.out.println(combinedStr.substring(i));
            }
        }
    }
}