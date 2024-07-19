public class Main {
    // 별 10개를 출력하는 함수
    public static void printStars() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println(); // 줄 바꿈
    }

    public static void main(String[] args) {
        // printStars 함수를 5번 호출
        for (int i = 0; i < 5; i++) {
            printStars();
        }
    }
}