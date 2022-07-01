package day31_inheriance.animal_methodOverriding;

public class AnimalTest {

    public static void main(String[] args) {


        Cat cat = new Cat("EMily",  "Bengle", 'F', 4, "Small", "Gray");

        Dog dog = new Dog("Max", "Husky", 'M', 3, "lARGE", "White");

        Lion lion = new Lion("Simba", "African lion", 'M', 6, "Large", "Yellow", true);

        Eagle eagle = new Eagle("Bella", "American EAgle", 'F', 4, "Medium", "Black & White");


        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);


        System.out.println("_______________________________________________________________");


        cat.eat();
        dog.eat();
        lion.eat();
        eagle.eat();


        System.out.println("___________________________________________________________________");


        cat.sleep();
        dog.sleep();
        eagle.sleep();
        lion.sleep();


    }
}
