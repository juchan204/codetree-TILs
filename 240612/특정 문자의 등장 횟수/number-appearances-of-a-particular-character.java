import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;

        // 문자열을 입력받습니다.
        str = sc.next();

        int length = str.length();
	    int startIdx = -1;

        int cnt = 0;
        int cnt1 = 0;

        for (int i = 0; i < length - 1; i++) {
            if (str.charAt(i) == 'e' && str.charAt(i + 1) == 'e') {
                cnt++;
            }
        }

        for (int i = 0; i < length - 1; i++) {
            if (str.charAt(i) == 'e' && str.charAt(i + 1) == 'e') {
                cnt1++;
            }
        }

        System.out.println(cnt +" "+cnt1);
        
    }
}