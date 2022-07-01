package day31_inheriance.animal_methodOverriding;

public class Cat extends Animal{


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat(){
        System.out.println(getName()+" is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 12 hours in a day");
    }



    public void scratch(){
        System.out.println("Cat "+getName()+" is scratching");
    }
}
