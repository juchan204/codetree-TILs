import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 입력받습니다.
        String str1 = sc.next();
        char s1 = str1.charAt(0);
        char s2 = str1.charAt(1);
        char[] arr = str1.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if (arr[i] == s1){
                arr[i] = s2;
            }
            else if (arr[i] == s2){
                arr[i] = s1;
            }
        }
        
        String s = String.valueOf(arr);
        System.out.println(s);
    }
}