package day14_forLoop;

public class WarmUpTask {
    public static void main(String[] args) {
        System.out.println(twoStringCombine("one", "eight"));
        System.out.println(sumOf2IntegerNumbers(10, 20));

    }


    public static String twoStringCombine(String word1, String word2){
//        if(word1.charAt(word1.length() - 1) == word2.charAt(0)){
//            return (word1 + word2.substring(1));
//        }else{
//            return word1 + word2;

        String result;
        if(word1.endsWith( "" + word2.charAt(0))){
            result = word1 + word2.substring(1);
        }else{
            result = word1  + word2;
        }
        return result;
    }

    public static int sumOf2IntegerNumbers(int n1, int n2){
        return n1 + n2;
    }


    public static int sumOf3IntegerNumbers(int n1, int n2, int n3){
        return sumOf2IntegerNumbers(n1, n2) + n3;
    }

    public static int sumOf4IntegerNumbers(int n1, int n2, int n3, int n4){
        //return sumOf3IntegerNumbers(n1, n2, n3) + n4;
        //return sumOf2IntegerNumbers(n1, n2) + sumOf2IntegerNumbers(n3, n4);
        return sumOf2IntegerNumbers(sumOf3IntegerNumbers(n1,n2,n3), n4);
    }




}
