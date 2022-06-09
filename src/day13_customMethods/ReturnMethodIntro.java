package day13_customMethods;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        addition(10,20);
        int answer = square(5);
        System.out.println(answer);
        System.out.println(cube(5));

    }



    public static int addition(int num1, int num2){ // void method does not return any data
        int result = num1 + num2;
        return result;

    }

    public static int square(int num){
        int res = num * num;
        return res;
    }


    public static int cube(int num){
        int cube = square(num) * num;
        return cube;
    }


}
