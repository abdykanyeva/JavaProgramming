package day34_abstraction.car;

public class TestCarObjects {

    public static void main(String[] args) {

       // Car car1 = new Car() we can not create car objects from abstract class


        Honda honda = new Honda("Pilot", "Black", 2019, 35000);

        Audi audi = new Audi("Q6", "Silver", 2020, 450000);

        Tesla tesla = new Tesla("Model Y", "Black", 2022, 60000 );

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);


        System.out.println("_____________________________________________");


        audi.stop();
        honda.stop();
        tesla.stop();


        System.out.println("______________________________________________________");


        audi.start();
        honda.start();
        tesla.start();

    }
}
