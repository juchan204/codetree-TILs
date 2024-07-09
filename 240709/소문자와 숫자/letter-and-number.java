import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                // 영문자인 경우 소문자로 변환하여 추가
                result.append(Character.toLowerCase(ch));
            } else if (Character.isDigit(ch)) {
                // 숫자인 경우 바로 추가
                result.append(ch);
            }
            // 그 외의 문자는 무시하고 넘어감
        }
        
        System.out.println(result.toString());
    }
}