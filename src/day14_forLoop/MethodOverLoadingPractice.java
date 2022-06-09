package day14_forLoop;

public class MethodOverLoadingPractice {

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10, 20, 30, 40));

        System.out.println(sum(10, 20.5));


    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return sum(a, b) + c;
    }
    public static int sum(int a, int b, int c, int d){
        return sum(a, b, c) + d;
    }
    public static double sum(double n1, double n2){
        return n1 + n2;
    }
    public static double sum(double n1, double n2, double n3){
        return sum(n1, n2) +n3;
    }
    public static double sum(double n1, double n2, double n3, double n4){
        return sum(n1, n2, n3) + n4;
    }





}
