import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                // 대문자인 경우 소문자로 변환하여 추가
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                // 소문자인 경우 대문자로 변환하여 추가
                result.append(Character.toUpperCase(ch));
            } else {
                // 알파벳이 아닌 경우 그대로 추가 (예를 들어 숫자나 기호)
                result.append(ch);
            }
        }
        
        System.out.println(result.toString());
    }
}