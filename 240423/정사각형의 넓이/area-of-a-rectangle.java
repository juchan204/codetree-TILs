import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int n;
        
        // 입력
        n = sc.nextInt();

        System.out.println(n*n);
      
        // 출력
        if(n < 5) {
            System.out.println("tiny");
        }
    
    }
}