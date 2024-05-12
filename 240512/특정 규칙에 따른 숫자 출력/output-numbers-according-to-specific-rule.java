import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();
        int cnt = 1;

        for(int i = n; i >= 1; i--) {
            for(int j = n; j >= 1; j--) {
                if(j > i)
                    System.out.print("  ");
                else {
                    System.out.print(cnt + " ");
                    cnt++;
                    if (cnt > 9){
                        cnt = 1;
                    }
                }
                    
            }
            System.out.println();
        }
    }
}