import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a;
        
        // 입력
        a = sc.nextInt();
        
        // 출력
        if(a >= 3000)
            System.out.println("book");
        else if(a >= 1000)
            System.out.println("mask");
        else if(a >= 500)
            System.out.println("pen");
        else
            System.out.println("no");
    }
}