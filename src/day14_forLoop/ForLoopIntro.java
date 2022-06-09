package day14_forLoop;

public class ForLoopIntro {
    public static void main(String[] args) {

//        for(int i = 1; i <=10; i++ ){
//            System.out.println("Hello world");
//
//        }
//
//        System.out.println("Hello Cydeo");
////        for(;;){                infinite loop
////            System.out.println("Hello Cydeo");
////        }
//
//        for(int i = 10; i>=5; i--){
//            System.out.println("hELLO CYDEO");
//        }


        int sum = 0;
        for(int i = 0; i <=100; i++){
            sum += i;
        }
        System.out.println(sum);

        for(char i = 'a'; i<= 'z'; i++){
            System.out.println(i);
        }

        for(char i = 'z'; i >='a'; i--){
            System.out.println(i + " ");
        }
        System.out.println();


    }
}
