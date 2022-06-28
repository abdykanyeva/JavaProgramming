package day29_inheritance.carTask;

public class TestCar {

    public static void main(String[] args) {

        Toyota toyota = new Toyota();
        toyota.setInfo("Toyota", "Toyota Camry", 2021, "Black", 40000);
        System.out.println(toyota);

        Honda honda = new Honda();
        honda.setInfo("HOnda", "Honda Accord", 2022, "White", 35000);
        System.out.println(honda);



    }
}
