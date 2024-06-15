import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열과 질의 수 입력
        String s = sc.next();
        int q = sc.nextInt();
        sc.nextLine();  // 개행 문자 소비

        // 문자열을 변형 가능한 StringBuilder로 변환
        StringBuilder str = new StringBuilder(s);

        // 질의 처리
        for (int i = 0; i < q; i++) {
            String query = sc.nextLine();
            String[] parts = query.split(" ");

            int type = Integer.parseInt(parts[0]);
            if (type == 1) {
                // 1 a b: a번째 문자와 b번째 문자를 교환
                int a = Integer.parseInt(parts[1]) - 1;
                int b = Integer.parseInt(parts[2]) - 1;
                char temp = str.charAt(a);
                str.setCharAt(a, str.charAt(b));
                str.setCharAt(b, temp);
            } else if (type == 2) {
                // 2 a b: 문자 a를 전부 문자 b로 변경
                char a = parts[1].charAt(0);
                char b = parts[2].charAt(0);
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == a) {
                        str.setCharAt(j, b);
                    }
                }
            }
            // 변형된 문자열 출력
            System.out.println(str.toString());
        }

        sc.close();
    }
}