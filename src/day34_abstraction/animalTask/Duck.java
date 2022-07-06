package day34_abstraction.animalTask;

public class Duck extends Animal implements Playable, Flyable, Swimmable{


    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Duck "+getName()+" eats worm");
    }


    @Override
    public void play() {
        System.out.println("Duck "+getName()+" is playing");
    }

    @Override
    public void fly(){
        System.out.println("Duck "+getName()+" is Flying");
    }

    @Override
    public void swim() {

    }
}
