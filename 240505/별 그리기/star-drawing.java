import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            // 공백 그리기
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            // 별(*) 그리기
            for(int j=0; j<2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 하단 부분 그리기
        for(int i=n-2; i>=0; i--) {
            // 공백 그리기
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            // 별(*) 그리기
            for(int j=0; j<2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // 변수 선언 및 입력
//         int n = sc.nextInt();

//         // Step 1:
//         for(int i = 1; i <= n; i++) {
//             for(int j = 0; j < n - i; j++) {
//                 System.out.print(" ");
//             }
//             for(int j = 0; j < 2 * i - 1; j++) {
//                 System.out.print("*");
//             }
//             for(int j = 0; j < n - i; j++) {
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
        
//         // Step 2:
//         for(int i = n - 1; i >= 1; i--) {
//             for(int j = 0; j < n - i; j++) {
//                 System.out.print(" ");
//             }
//             for(int j = 0; j < 2 * i - 1; j++) {
//                 System.out.print("*");
//             }
//             for(int j = 0; j < n - i; j++) {
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }