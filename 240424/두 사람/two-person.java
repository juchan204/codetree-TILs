import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a_age, b_age;
        String a_sex, b_sex;
        
        // 입력
        a_age = sc.nextInt(); // 첫 번째 사람의 나이
        a_sex = sc.next(); // 첫 번째 사람의 성별
        b_age = sc.nextInt(); // 두 번째 사람의 나이
        b_sex = sc.next(); // 두 번째 사람의 성별

        // 출력
        // 첫 번째 사람이나 두 번째 사람 중 한 사람이라도 19세 이상이면서 남자라면 1을 출력
        if ((a_age >= 19 && a_sex.equals("M")) || (b_age >= 19 && b_sex.equals("M"))) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        sc.close(); // Scanner 객체 닫기
    }
}