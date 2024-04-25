import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언
        int a, n;

        // 입력
        a = sc.nextInt();
        n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            a += n;
            System.out.println(a);
            
            
        }
    }
}