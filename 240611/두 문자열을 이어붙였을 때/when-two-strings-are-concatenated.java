import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄에 문자열 A 입력
        String A = sc.nextLine();

        // 두 번째 줄에 문자열 B 입력
        String B = sc.nextLine();

        // 두 문자열을 이어붙임
        String AB = A + B;
        String BA = B + A;

        // 두 이어붙인 문자열이 같은지 비교
        if (AB.equals(BA)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // 문자열을 입력받습니다.
//         String a = sc.next();
//         String b = sc.next();

//         // 문자열 c에 문자열 a와 b를 붙입니다.
//         String c = a + b;

//         // 문자열 d에 문자열 b와 a를 붙입니다.
//         String d = b + a;

//         // 문자열 c와 d가 정확하게 같은지 여부를 확인합니다.
//         boolean satisfied = true;
//         for(int i = 0; i < c.length(); i++)
//             if(c.charAt(i) != d.charAt(i))
//                 satisfied = false;
        
//         // 두 문자열이 같다면 true를, 같지 않다면 false를 출력합니다.
//         if(satisfied)
//             System.out.print("true");
//         else
//             System.out.print("false");
//     }
// }