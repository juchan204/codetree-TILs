import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a , b;
        
        // 입력
        a = sc.nextInt();
        b = sc.nextInt();

        // 출력
        if( a >= 90 && b >= 95)
            System.out.println("100000");
        else if(a >= 90 && b >= 90)
            System.out.println("50000");
        else if(a >= 90 && b >= 90)
            System.out.println("0");
        else
            System.out.println("0");
    }
}