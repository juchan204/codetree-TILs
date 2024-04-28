import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        int i; // i를 for 루프 바깥에서 선언

        for (i = 1; i <= 100; i++) {
            b += i;

            if (b >= a)
                break; // 조건을 만족하면 루프에서 나옴
        }

        System.out.print(i); // 루프 밖에서 i를 참조할 수 있음
    }
}