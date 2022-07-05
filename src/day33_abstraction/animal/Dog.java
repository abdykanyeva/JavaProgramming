package day33_abstraction.animal;

public class Dog extends Animal{


    public Dog(String name, String breed, char gender, String size) {
        super(name, breed, gender, size);
    }

    public void eat(){
        System.out.println(getClass().getSimpleName() +" eats dog food");
    }

}
