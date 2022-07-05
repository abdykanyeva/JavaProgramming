package day33_abstraction.animal;

public class Fish extends Animal{


    public Fish(String name, String breed, char gender, String size) {
        super(name, breed, gender, size);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats fish food");

    }
}
