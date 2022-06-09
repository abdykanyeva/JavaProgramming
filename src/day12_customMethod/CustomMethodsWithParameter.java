package day12_customMethod;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {
        oddOrEven(5);
        initial("Adelina Abdykanyeva");

    }


//    the method takes an argument number, and verifies if the number is odd number and even number
    public static void oddOrEven(int num){
        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }



    // create a method if that can check if a person is eligible to buy alcohol

    public static void eligibleToBuyAlcohol(int age){

        if(age >= 21){
            System.out.println("ELigible to buy");
        }else{
            System.out.println("Not ELigible");
        }

    }






    // create a method that can check if a number is odd, or even or zero
    public static void numbers(int num){
        if(num%2==0){
            System.out.println("Even");
        }else if(num%2!=0){
            System.out.println("Odd");
        }else{
            System.out.println("Zero");
        }
    }



    // crate method that can calculate the grade of the students
    public static void initial(String init){
        String firstName = init.substring(0,1) + init.substring(init.indexOf(" "), init.indexOf(" ") + 1);
        System.out.println(firstName);


    }

}
