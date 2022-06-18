package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthDay = LocalDate.of(1997, 4, 16);
        System.out.println(birthDay);


        System.out.println(today.getDayOfWeek());

        System.out.println(birthDay.getDayOfWeek());

        LocalDate graduationDate  = LocalDate.of(2025, 6, 4);
        graduationDate = graduationDate.plusYears (2);

        System.out.println(graduationDate);

        LocalDate grad_date = LocalDate.of(2023, 1, 1);
        System.out.println(grad_date.isBefore(LocalDate.of(2022, 12, 31)));
        System.out.println(grad_date.isAfter(LocalDate.of(2022, 12, 5)));




    }
}
