import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.nextLine();
        StringBuilder outputStr = new StringBuilder();

        for (char c : inputStr.toCharArray()) {
            if (Character.isLetter(c)) {
                outputStr.append(Character.toUpperCase(c));
            }
        }

        System.out.println(outputStr.toString());
    }
}