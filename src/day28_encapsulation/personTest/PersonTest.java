package day28_encapsulation.personTest;

public class PersonTest {

    public static void main(String[] args) {

        Person person1 = new Person("Mohammad");
        Person person2 = new Person("Abidullah", 'm');
        Person person3 = new Person("Hasan", 30);
        Person person4 = new Person("Daniel", "ENglish");
        Person person5 = new Person("Tatiana", 25, 'f');
        Person person6 = new Person("Lucy", 31, 'f', "english");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);
    }
}
