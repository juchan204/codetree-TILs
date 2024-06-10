import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄에 문자열 A 입력받음
        String str = sc.nextLine();

        // 결과를 저장할 StringBuilder를 생성
        StringBuilder encoded = new StringBuilder();

        // 문자열의 길이
        int length = str.length();
        
        // 현재 문자의 인덱스
        int i = 0;
        
        while (i < length) {
            char currentChar = str.charAt(i);
            int count = 1;

            // 연속된 문자의 개수를 셈
            while (i + 1 < length && str.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }

            // 현재 문자와 그 개수를 결과에 추가
            encoded.append(currentChar);
            encoded.append(count);
            
            // 다음 문자로 이동
            i++;
        }

        // 결과 문자열의 길이
        int encodedLength = encoded.length();
        
        // 결과 출력
        System.out.println(encodedLength);
        System.out.println(encoded.toString());
    }
}