import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄에 문자열 입력받음
        String str = sc.nextLine();

        // 문자열의 길이
        int length = str.length();

        // 짝수 번째 문자의 개수를 계산
        int evenCharCount = length / 2;

        // 짝수 번째 문자를 저장할 배열 생성
        char[] evenChars = new char[evenCharCount];

        // 짝수 번째 문자 추출
        int index = 0;
        for (int i = 1; i < length; i += 2) {
            evenChars[index++] = str.charAt(i);
        }

        // 결과를 저장할 StringBuilder
        StringBuilder result = new StringBuilder();

        // 역순으로 배열을 순회하며 결과에 추가
        for (int i = evenCharCount - 1; i >= 0; i--) {
            result.append(evenChars[i]);
        }

        // 결과 출력
        System.out.println(result.toString());
    }
}