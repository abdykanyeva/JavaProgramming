package day10_String;

public class StringMethod1 {
    public static void main(String[] args) {
        String str = "Cydeo";
        // index:     01234

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);

        System.out.println("__________________________________");


        String sentence = "Java Programming language";
        int length = sentence.length();
        System.out.println(length);
        int lastIndex = length - 1;
        System.out.println("lastIndex = " + lastIndex);

        System.out.println("________________________________________");

        String s1 = "Wooden Spoon";
        char first = s1.charAt(0);
        int last = s1.length() - 1;
        char lastOne = s1.charAt(last);
        System.out.println("first = " + first);
        System.out.println("last = " + lastOne);

    }
}
