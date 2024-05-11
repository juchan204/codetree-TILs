import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print((i + 1) * cnt + " ");
                cnt ++;
            }
            System.out.println();
            cnt = 1;
        }
    }
}

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // 변수 선언 및 입력
//         int n = sc.nextInt();

//         // 숫자로 이루어진 삼각형을 출력합니다.
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print((i * j) + " ");
//             }
//             System.out.println();
//         }
//     }
// }