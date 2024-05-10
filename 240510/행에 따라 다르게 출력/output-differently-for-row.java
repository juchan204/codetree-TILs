import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 사용자로부터 숫자 입력 받기

        int currentNum = 0; // 현재 숫자를 추적하기 위한 변수

        for (int i = 0; i < n; i++) { // 각 행에 대해 반복
            if (i % 2 == 0) { // 짝수 행인 경우 (0부터 시작하므로 실제로는 홀수 번째 행)
                for (int j = 0; j < n; j++) { // 각 열에 대해 반복
                    currentNum++; // 숫자 증가
                    System.out.print(currentNum + " "); // 현재 숫자 출력
                    
                }
            } 
            else { // 홀수 행인 경우 (실제로는 짝수 번째 행)
                for (int j = 0; j < n; j++) {
                    currentNum += 2;
                    System.out.print(currentNum + " ");
                }
            }
            System.out.println(); // 행이 끝나면 줄바꿈
        }
    }
}