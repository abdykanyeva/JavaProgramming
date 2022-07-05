package day33_abstraction.animal;

public class TestAnimal {

    public static void main(String[] args) {

        Dog dog = new Dog("Lucy", "Husky", 'F', "Medium");

        Cat cat = new Cat("Basta", "JJJ",'M', "Small");

        System.out.println(dog);
        System.out.println(cat);

        dog.eat();
        cat.eat();



    }
}
