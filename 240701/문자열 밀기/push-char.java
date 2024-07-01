import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();

        // 왼쪽으로 한 칸 shift
        String shiftedStr = inputStr.substring(1) + inputStr.charAt(0);

        System.out.println(shiftedStr);
    }
}