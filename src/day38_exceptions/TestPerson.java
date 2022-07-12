package day38_exceptions;

public class TestPerson {

    public static void main(String[] args) {

        Person person = new Person("Azamat", 29, 'M' );
        System.out.println(person);

        try {
            person.setAge(-25);
        }catch(RuntimeException e){
            e.printStackTrace();
        }

    }
}
