import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            int start = sc.nextInt();
            int end = sc.nextInt();

            // Step 1:
            int cnt = 0;
            for(int j = start; j <= end; j++){
                if(j % 2 == 0){
                    cnt += j;
                }
            }
            System.out.println(cnt);
        }
    }
}