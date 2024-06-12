import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄에 입력 문자열을 입력받음
        String inputString = sc.nextLine();

        // 두 번째 줄에 목적 문자열을 입력받음
        String targetString = sc.nextLine();

        // 입력 문자열에서 목적 문자열의 인덱스를 찾음
        int index = inputString.indexOf(targetString);

        // 인덱스를 출력, 없으면 -1 출력
        System.out.println(index);
    }
}