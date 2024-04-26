import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // n일 동안
        int cntClassroom = 0, cntCorridor = 0, cntToilet = 0;

        for (int i = 1; i <= n; i++) {
            // 12일마다 화장실 청소를 우선합니다.
            if (i % 12 == 0) {
                cntToilet++;
            }
            // 그 다음으로 3일마다 복도 청소를 고려합니다. 단, 화장실 청소일에는 제외합니다.
            else if (i % 3 == 0) {
                cntCorridor++;
            }
            // 마지막으로 2일마다 교실 청소를 고려합니다. 단, 화장실 또는 복도 청소일에는 제외합니다.
            else if (i % 2 == 0) {
                cntClassroom++;
            }
        }
        // 각 장소별 청소 횟수 출력
        System.out.println(cntClassroom + " " + cntCorridor + " " + cntToilet);
    }
}