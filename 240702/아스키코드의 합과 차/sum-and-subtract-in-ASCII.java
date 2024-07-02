import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] chars = input.split(" ");

        int char1 = (int) chars[0].charAt(0);
        int char2 = (int) chars[1].charAt(0);

        int sum = char1 + char2;
        int diff = Math.abs(char1 - char2);

        System.out.println(sum + " " + diff);
    }
}