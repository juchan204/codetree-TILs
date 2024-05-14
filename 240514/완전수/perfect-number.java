import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int perfectNumbersCount = 0;

        for (int i = a; i <= b; i++) {

            int cnt = 0;

            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    cnt += j; // 나누어 떨어지면 진약수이므로 합에 추가
                }
            }
            if (cnt == i) {
                perfectNumbersCount++;
            }
        }
        System.out.println(perfectNumbersCount); // 완전수의 개수를 출력
    }
}

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // 변수 선언 및 입력
//         int start = sc.nextInt();
//         int end = sc.nextInt();
//         int answer_cnt = 0;

//         for(int curr_num = start; curr_num <= end; curr_num++) {
//             // Step 1:
//             int divisor_sum = 0;
//             for(int divisor = 1; divisor <= curr_num-1; divisor++){
//                 if(curr_num % divisor == 0){
//                     divisor_sum += divisor;
//                 }
//             }
//             // Case 1:
//             if(divisor_sum == curr_num){
//                 answer_cnt++;
//             }
//         }
        
//         System.out.println(answer_cnt);
//     }
// }