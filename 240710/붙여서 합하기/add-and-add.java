import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        // 공백을 기준으로 입력을 A와 B로 나눔
        String[] parts = input.split(" ");
        String A = parts[0];
        String B = parts[1];
        
        // AB와 BA를 만들어서 정수로 변환하여 합을 구함
        String AB = A + B;
        String BA = B + A;
        
        int sum = Integer.parseInt(AB) + Integer.parseInt(BA);
        
        System.out.println(sum);
    }
}