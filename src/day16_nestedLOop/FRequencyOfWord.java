package day16_nestedLOop;

import java.util.Locale;

public class FRequencyOfWord {
    public static void main(String[] args) {

        String sentence = "java Java jAva JAVA";

        String word = "Java";
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int count = 0;
        while(sentence.contains(word)){
            count ++;
            sentence = sentence.replaceFirst("java", "");
        }
        System.out.println(count);

    }
}
