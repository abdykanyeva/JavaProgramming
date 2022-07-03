package day32_finalKeyword;

import java.time.LocalDate;


class CydeoStudent{

    public final void language(){
        System.out.println("Java Programming");
    }

}

public final class FinalKeyword extends CydeoStudent {

/*
    public void language(){
        System.out.println("Python programming"); // final methods can never be overridden
    }

 */

    public  FinalKeyword(){

    }

    public static void main(String[] args) {

        final char gender ='m';
        System.out.println(gender);

        // gender = 'f';

        System.out.println(gender);


        System.out.println("________________________________________");

        final LocalDate dateOfBirth =  LocalDate.now();
        System.out.println(dateOfBirth);



        new CydeoStudent().language();
        new FinalKeyword().language();

        final String name = "James";
       // name = null;

        // name = "Kevin";

        System.out.println(name);

    }
}
