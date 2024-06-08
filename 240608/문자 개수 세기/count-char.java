import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 정의합니다.
        String str;
        
        // 문자열을 입력받습니다.
        str = sc.nextLine();
        char n = sc.next().charAt(0);
        int cnt = 0;
        
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == n){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}