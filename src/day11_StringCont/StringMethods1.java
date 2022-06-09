package day11_StringCont;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "I love Python, Python is the best programming language, " +
                "and Python is iin high demand";
        str1 = str1.replace("Python", "Jav");
        System.out.println(str1);

        //------------------------------------------------------------------------------
        String word = "java";
        word = word.replace('a','e');
        System.out.println(word);
        //----------------------------------------------


        String str = "Today is Sunday, Tomorrow is Monday";
        int tomorrow = str.lastIndexOf('M');
        System.out.println(str.substring(tomorrow));

        String tomorrow1 = str.substring(str.lastIndexOf(" ") + 1);
        System.out.println(tomorrow1);


        String word3 = "Python";
        word3 = word3.repeat(7);
        System.out.println(word3);




    }
}
