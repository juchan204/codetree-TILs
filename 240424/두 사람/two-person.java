import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a_age, a_sex;
        int b_age, b_sex;
        
        // 입력
        a_age = sc.nextInt();
        a_sex = sc.nextInt();
        b_age = sc.nextInt();
        b_sex = sc.nextInt();

        // 출력
        if(a_age >= 19 && a_sex == 'M' || b_age >= 19 && b_sex == 'M')
            System.out.println("1");
        else
            System.out.println("0");
    }
}