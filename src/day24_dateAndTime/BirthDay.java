package day24_dateAndTime;

import java.time.LocalDate;

public class BirthDay {

    public static void main(String[] args) {


        LocalDate birthday = LocalDate.of(1997, 6, 16);

        if(birthday.getDayOfYear() == LocalDate.now().getDayOfYear()){
            System.out.println("Happy birthday! \n You are " + (birthday.getYear() - LocalDate.now().getYear()));
        }else{
            System.out.println("Today is not your birthday");
        }
    }
}
