import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String str = input[0];
        int q = Integer.parseInt(input[1]);

        for (int i = 0; i < q; i++) {
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    str = shiftLeft(str);
                    break;
                case 2:
                    str = shiftRight(str);
                    break;
                case 3:
                    str = reverseString(str);
                    break;
            }
            System.out.println(str);
        }
    }

    private static String shiftLeft(String str) {
        char firstChar = str.charAt(0);
        return str.substring(1) + firstChar;
    }

    private static String shiftRight(String str) {
        char lastChar = str.charAt(str.length() - 1);
        return lastChar + str.substring(0, str.length() - 1);
    }

    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}