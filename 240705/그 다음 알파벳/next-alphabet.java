import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.nextLine().charAt(0);
        
        if (c == 'z') {
            System.out.println('a');
        } else {
            System.out.println((char)(c + 1));
        }
    }
}