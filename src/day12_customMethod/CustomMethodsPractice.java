package day12_customMethod;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        maxNum(15, 25);
        initial("Adelina", "Abdykanyeva");

    }


    public static void maxNum(double num1, double num2){
        if(num1 > num2){
            System.out.println(num1 + " is the maximum number");
        }else if(num2 > num1){
            System.out.println(num2 + " is the maximum number");

        }else{
            System.out.println("Equal");
        }

    }


    public static void initial(String firstName, String lastName){
        String initial = firstName.substring(0,1) + lastName.substring(0,1);
        System.out.println(initial);

    }



}
