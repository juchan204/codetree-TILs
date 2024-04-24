import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a, b, c;
        char a_cold , b_cold , c_cold;
        
        // 입력
        a_cold = sc.next().charAt(0);
        a = sc.nextInt();
        b_cold = sc.next().charAt(0);
        b = sc.nextInt();
        c_cold = sc.next().charAt(0);
        c = sc.nextInt();
        

        // 출력
        if(a_cold == 'Y' && a >= 37) {
            if(b_cold == 'Y' && b >= 37 || c_cold == 'Y' && c >= 37)
                System.out.println("E");
            else
                System.out.println("N");
        }
        else if(b_cold == 'Y' && b >= 37) {
            if(a_cold == 'Y' && a >= 37 || c_cold == 'Y' && c >= 37)
                System.out.println("E");
            else
                System.out.println("N");
        }
        else if(c_cold == 'Y' && c >= 37) {
            if(b_cold == 'Y' && b >= 37 || a_cold == 'Y' && a >= 37)
                System.out.println("E");
            else
                System.out.println("N");
        }

        
    }
}