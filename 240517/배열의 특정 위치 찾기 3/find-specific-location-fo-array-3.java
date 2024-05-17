import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100]; // 최대 100개의 정수를 저장할 수 있는 배열
        int count = 0; // 입력받은 정수의 개수를 세는 변수

        // 정수를 입력받아 배열에 저장
        for (int i = 0; i < 100; i++) {
            int num = sc.nextInt();
            if (num == 0) { // 0이 입력되면 반복문을 종료
                break;
            }
            arr[i] = num;
            count++; // 입력받은 정수의 개수를 증가
        }

        if (count >= 3) { // 최소 3개 이상의 정수가 입력되어야 합니다.
            int sum = arr[count - 1] + arr[count - 2] + arr[count - 3]; // 마지막으로 입력된 3개의 정수의 합
            System.out.println(sum);
        } 
    }
}