package day17_customClass;

public class TestDogObject {

    public static void main(String[] args) {

       Dog dog1 = new Dog();
       dog1.name = "Alma";
       dog1.breed = "Husky";
       dog1.gender = 'f';
       dog1.age = 4;
       dog1.size = "Large";
       dog1.color = "White";

       dog1.eat();
        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.setInfo("Max", "Choko", "small", 'm', 5 ,"Grey");
        System.out.println(dog2);




    }
}
