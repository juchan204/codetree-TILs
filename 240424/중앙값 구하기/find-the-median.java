import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 입력 받기
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // 중앙값을 저장할 변수
        int median;

        // 중앙값 찾기
        if ((a >= b && a <= c) || (a >= c && a <= b)) {
            median = a;
        } else if ((b >= a && b <= c) || (b >= c && b <= a)) {
            median = b;
        } else {
            median = c;
        }

        // 중앙값 출력
        System.out.println(median);

    }
}