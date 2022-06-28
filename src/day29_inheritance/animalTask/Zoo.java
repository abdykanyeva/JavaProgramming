package day29_inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setInfo("Max", "Husky", "Medium", "White", 'F', 4);


        Cat cat1 = new Cat();
        cat1.setInfo("FElicia", "stray", "Medium", "grey", 'm', 3);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", "Large", "Orange", 'M', 5);

        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(tiger);

        System.out.println("____________________________________________");

        dog1.bark();
        dog1.eat();
        dog1.sleep();
        dog1.drink();

        cat1.eat();
        cat1.drink();
        cat1.sleep();

        tiger.eat();
        tiger.sleep();
        tiger.drink();


        System.out.println("____________________________________________");

        System.out.println(dog1.getAge());
        System.out.println(dog1.getName());

        dog1.setGender('F');
        dog1.setAge(8);







    }
}
