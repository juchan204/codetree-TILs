import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        double[] arr = new double[8];
        double sum = 0;

        // 배열에 실수를 입력받아 저장합니다.
        for(int i = 0; i < 8; i++) {
            arr[i] = sc.nextDouble();
        }
        
        // 배열에 있는 실수들의 합을 구합니다.
        for(int i = 0; i < 8; i++) {
            sum += arr[i];
        }

        //평균 구하기
        double avg = sum / 8;

        // 출력
        System.out.printf("%.1f\n", avg);

    }
}