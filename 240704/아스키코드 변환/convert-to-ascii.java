import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        
        char a = parts[0].charAt(0);
        int b = Integer.parseInt(parts[1]);
        
        int asciiCodeOfA = (int) a;
        char asciiCharOfB = (char) b;
        
        System.out.println(asciiCodeOfA + " " + asciiCharOfB);
    }
}