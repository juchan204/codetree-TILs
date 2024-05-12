import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for ( int j = 0 ; j < i ; j++){
                System.out.print("  ");
            }
            for ( int j = n - i ; j > 0 ; j--){
                System.out.print(j + " ");
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


//         // 숫자로 이루어진 삼각형을 출력합니다.
//         for(int i = n; i >= 1; i--) {
//             for(int j = n; j >= 1; j--) {
//                 if(j > i)
//                     System.out.print("  ");
//                 else
//                     System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }