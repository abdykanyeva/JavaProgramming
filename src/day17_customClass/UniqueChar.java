package day17_customClass;

public class UniqueChar {
    public static void main(String[] args) {

        String str = "aabcccd";

        String result = " ";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);      //

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == ch){
                    result += ch;
                }

            }
            System.out.println(result);

        }





    }
}
