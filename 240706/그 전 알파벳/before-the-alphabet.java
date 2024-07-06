import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.nextLine().charAt(0);
        
        if (input == 'a') {
            System.out.println('z');
        } else {
            System.out.println((char)(input - 1));
        }
    }
}