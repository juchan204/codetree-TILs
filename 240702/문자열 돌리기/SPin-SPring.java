import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        int length = inputStr.length();

        System.out.println(inputStr);
        for (int i = 0; i < length; i++) {
            // 오른쪽으로 한 글자씩 이동
            inputStr = inputStr.charAt(length - 1) + inputStr.substring(0, length - 1);
            System.out.println(inputStr);
        }
    }
}