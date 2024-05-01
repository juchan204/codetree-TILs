import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int cnt = 0 ;

        while (true){
            if ( a / 2 > 1){
                a = a / 2 ;
                cnt ++;
            }
                
            
            else {
                cnt ++;
                break ;
            }
                
        }
        System.out.println(cnt);
    }
}

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         // 변수 선언 및 입력
//         int n;
//         n = sc.nextInt();
//         int prod = 1;
// 	    int x = 0;

//         while(true) {
//             // prod가 n이 될 때까지 2를 곱합니다.
//             if(n == prod)
//                 break;
            
//             prod *= 2;
//             x++;
//         }

//         System.out.println(x);
//     }
// }