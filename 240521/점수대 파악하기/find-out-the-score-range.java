import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int[] countArr = new int[11]; // 0부터 10까지의 인덱스를 사용하기 위해 11개 배열 선언

        for (int i = 0; i < 99; i++) {
            int score = sc.nextInt();
            if (score == 0) {
                break;
            }
            if (score >= 10) { // 10점 이상인 점수만 카운트
                countArr[score / 10]++;
            }
        }
        
        // 10부터 100까지 나온 횟수를 출력
        for (int i = 10; i >= 1; i--) {
            System.out.println((i * 10) + " - " + countArr[i]);
        }
    }
}