import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        int sum = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                int digit = Character.getNumericValue(ch); // char를 int로 변환하여 숫자 값을 가져옴
                sum += digit;
            }
        }
        
        System.out.println(sum);
    }
}