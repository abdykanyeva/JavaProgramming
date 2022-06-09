package day13_customMethods;

public class LunchPractice {
    public static void main(String[] args) {
        System.out.println(isOdd(7));
        System.out.println(isEven(5));



    }

    public static boolean isOdd(int num){
        if(num % 2 != 0){

        }return true;
    }

    public static boolean isEven(int num){
        boolean isEven = !isOdd(num);
        return  isEven;
    }

}
