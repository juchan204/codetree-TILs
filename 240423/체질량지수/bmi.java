import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int h, w;
        int b;
        
        // 입력
        h = sc.nextInt();
        w = sc.nextInt();
        b = (10000 * w)/(h * h);

        // 출력
        if(b >= 25) {
            System.out.println(b);
            System.out.println("Obesity");
        }
            
        if(b < 25)
            System.out.println(b);
    }
}