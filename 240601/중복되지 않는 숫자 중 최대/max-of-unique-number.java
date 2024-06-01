import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 원소의 수 입력 받기
        int[] numbers = new int[N]; // 숫자들을 저장할 배열
        int[] freq = new int[1001]; // 각 숫자의 등장 횟수를 저장할 배열 (주어진 범위에 따라)

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt(); // 숫자 입력 받기
            freq[numbers[i]]++; // 해당 숫자의 등장 횟수 증가
        }

        int maxUnique = -1; // 중복되지 않는 숫자들 중 최댓값을 저장할 변수, 초기값은 -1

        for (int i = 0; i < N; i++) {
            if (freq[numbers[i]] == 1) { // 숫자가 중복되지 않는 경우
                maxUnique = Math.max(maxUnique, numbers[i]); // 현재 최댓값과 비교하여 더 큰 값을 저장
            }
        }

        System.out.println(maxUnique); // 결과 출력
    }
}

// import java.util.Scanner;

// public class Main {
//     public static final int MAX_N = 1000;

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n;
//         int[] nums = new int[MAX_N];

//         // 입력
//         n = sc.nextInt();
//         for(int i = 0; i < n; i++)
//             nums[i] = sc.nextInt();

//         // 최댓값 찾기
//         int max = -1;
//         for(int i = 0; i < n; i++) {
//             int currNum = nums[i];
//             // 최대가 될 수 있는 후보입니다.
//             if(max < currNum) {
//                 // 갱신할 수 있는지 확인하기 위해 이 숫자의 등장 빈도를 셉니다.
//                 int count = 0;
//                 for(int j = 0; j < n; j++) {
//                     if(nums[j] == currNum) {
//                         count++;
//                     }
//                 }
//                 // 이 숫자가 배열에서 유일할때만 갱신합니다.
//                 if(count == 1) {
//                     max = currNum;
//                 }
//             }
//         }

//         // 최댓값과 최솟값을 출력합니다.
//         System.out.print(max);
//     }
// }