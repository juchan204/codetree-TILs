import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 정수 입력받기
        int input = scanner.nextInt();
        
        // 조건을 만족할 때까지 배수를 저장할 배열
        int[] multiples = new int[100]; // 임의로 크기를 설정. 필요에 따라 조정 가능
        
        int count = 0; // 배열에 저장된 요소의 수
        int fiveMultiples = 0; // 5의 배수가 몇 번 출력되었는지 추적
        
        for (int i = 1; fiveMultiples < 2; i++) {
            int multiple = input * i; // 현재 숫자의 배수를 계산
            
            // 5의 배수가 나오면 fiveMultiples 증가
            if (multiple % 5 == 0) {
                fiveMultiples++;
            }
            
            // 조건을 만족하지 않으면 반복 종료
            if (fiveMultiples > 2) {
                break;
            }
            
            // 배수를 배열에 저장
            multiples[count++] = multiple;
        }
        
        // 결과 출력
        for (int i = 0; i < count; i++) {
            System.out.print(multiples[i] + " ");
        }
    }
}