import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 입력받습니다.
        String str1 = sc.next();
        String str2 = sc.next();

        // 문자열의 길이를 구합니다.
        int len = str2.length();

        // 문자열의 앞에서 두 번째 원소와 뒤에서 두 번째 원소를 'a'로 대체합니다.
        str2 = str1.substring(0, 2)+ str2.substring(2, len);
            
        // 대체된 이후의 문자열을 출력합니다
        System.out.println(str2);
    }
}