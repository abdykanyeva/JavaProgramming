package day32_finalKeyword.carTask_methodOverriding;

public class TestCarObjects {


    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", "Blue", 2020, 25000);

        Honda honda = new Honda("Accord", "Gray", 2019, 24000);

        Audi audi = new Audi("Q6", "Black", 2021, 50000);

        BMW bmw = new BMW("x6", "Black", 2017, 45000);

        Tesla tesla = new Tesla("Model 3", "White", 2022, 65000);


        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(tesla);




        toyota.start();
        honda.start();
        audi.start();
        bmw.start();
        tesla.start();


    }
}
