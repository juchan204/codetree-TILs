public class Main {
    public static void main(String[] args) {
        String input = "2021.Leebros.Hello";
        String result = getUppercaseAlphabets(input);
        System.out.println(result);
    }

    public static String getUppercaseAlphabets(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }
}