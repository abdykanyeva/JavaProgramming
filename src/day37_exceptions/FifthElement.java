package day37_exceptions;

public class FifthElement {

    public static void main(String[] args) {


        int [] num = {1, 2, 3, 4};

        try{
            System.out.println(num[5]);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Program ended");

    }
}
