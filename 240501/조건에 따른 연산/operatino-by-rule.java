import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int cnt = 0 ;

        while (a < 1000){

            if ( a % 2 == 0){
                a = a * 3 + 1;
                cnt ++;
            }
            else {
               a = a * 2 + 2 ;
               cnt ++; 
            }
                
        }

        System.out.print(cnt);
    }
}

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         // 변수 선언 및 입력
//         int n;
//         n = sc.nextInt();
//         int cnt = 0;

//         while(true) {
//             // n이 1000이 될 때까지 연산을 반복합니다.
//             if(n >= 1000)
//                 break;
            
//             if(n % 2 == 1)
//                 n = 2 * n + 2;
//             else
//                 n = 3 * n + 1;
            
//             cnt++;
//         }

//         System.out.println(cnt);
//     }
// }