package day15_whileLoop;

public class ContinueStatement {

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            if(i == 4){
                continue;
            }

            System.out.println(i);

        }
        System.out.println("_____________________________________________________");

        for (int i = 10; i < 21; i++) {
            if(i % 2 == 0){
                continue; // skips the
            }
            System.out.println(i);
        }

        for(int i = 0; i < 10; i++){
            System.out.println("Hello World");
        }

        System.out.println("_____________________________________________");





    }
}
