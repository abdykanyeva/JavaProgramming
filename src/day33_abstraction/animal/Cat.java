package day33_abstraction.animal;

public class Cat extends Animal {

    public Cat(String name, String breed, char gender, String size) {
        super(name, breed, gender, size);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats cat food");
    }
}
