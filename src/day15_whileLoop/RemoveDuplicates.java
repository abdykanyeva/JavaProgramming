package day15_whileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "aaabbbccc";
        String result = " ";

        for (int i = 0; i < input.length(); i++) {
            if (!result.contains(""+input.charAt(i))) {
                result += input.charAt(i);
            }

        }
        System.out.println(result);
    }
}
