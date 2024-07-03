import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        for (String number : numbers) {
            int value = Integer.parseInt(number);
            if (value >= 33 && value <= 126) {
                System.out.print((char) value + " ");
            }
        }
    }
}