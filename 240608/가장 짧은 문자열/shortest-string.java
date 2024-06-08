import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 세 문자열 입력 받기
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        // 각 문자열의 길이 계산
        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        // 가장 긴 문자열의 길이 찾기
        int maxLength = Math.max(len1, Math.max(len2, len3));

        // 가장 짧은 문자열의 길이 찾기
        int minLength = Math.min(len1, Math.min(len2, len3));

        // 가장 긴 문자열과 가장 짧은 문자열의 길이 차이 계산 및 출력
        System.out.println(maxLength - minLength);
    }
}

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // 문자열을 입력받습니다.
//         String str1 = sc.next();
//         String str2 = sc.next();
//         String str3 = sc.next();

//         // 문자열의 길이를 구합니다.
//         int len1 = str1.length();
//         int len2 = str2.length();
//         int len3 = str3.length();

//         // 세 문자열 중 가장 긴 길이와 가장 짧은 길이를 구합니다.
//         int mx = len1;
//         if(mx < len2) mx = len2;
//         if(mx < len3) mx = len3;
//         int mn = len1;
//         if(mn > len2) mn = len2;
//         if(mn > len3) mn = len3;

//         // 문제에서 구하고자 하는 값을 출력합니다.
//         System.out.print(mx - mn);
//     }
// }