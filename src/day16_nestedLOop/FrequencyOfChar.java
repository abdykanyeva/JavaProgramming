package day16_nestedLOop;

public class FrequencyOfChar {
    public static void main(String[] args) {

        String str = "aaabbcccc";
        char ch = 'c';

        int count = 0;
        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            if(str.charAt(i) == ch){
                // if the character of the string is equal yo the given character, it means the given character has appeared in the string
                count ++;
            }

        }
        System.out.println(count);
    }
}
