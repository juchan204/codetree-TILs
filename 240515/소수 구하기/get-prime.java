import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int end = sc.nextInt();
        int answer_cnt = 0;

        for(int curr_num = 1; curr_num <= end; curr_num++) {
            // Step 1:
            int divisor_cnt = 0;
            for(int divisor = 1; divisor <= curr_num; divisor++){
                if(curr_num % divisor == 0){
                    divisor_cnt++;
                }
            }
            // Case 1:
            if(divisor_cnt == 2){
                System.out.print(curr_num + " ");
            }
        }
    }
}