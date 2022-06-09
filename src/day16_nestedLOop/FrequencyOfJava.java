package day16_nestedLOop;

public class FrequencyOfJava {
    public static void main(String[] args) {
        String sentence = "My lovely programming language is java. I like java. java is cool";
        String word = "java";

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
