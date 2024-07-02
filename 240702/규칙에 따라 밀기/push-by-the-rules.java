import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String command = scanner.nextLine();

        StringBuilder sb = new StringBuilder(A);

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'L') {
                char first = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(first);
            } else {
                char last = sb.charAt(sb.length() - 1);
                sb.deleteCharAt(sb.length() - 1);
                sb.insert(0, last);
            }
        }

        System.out.println(sb.toString());
    }
}