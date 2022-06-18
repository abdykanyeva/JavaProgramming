package day25_Constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {


    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("y");

        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));


        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mma");
        LocalTime time1 = LocalTime.of(7, 5);

        System.out.println(time1.format(tf));


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM/dd/y  hh:mm a");
        LocalDateTime date = LocalDateTime.now();

        System.out.println(date.format(dtf));





        DateTimeFormatter drf = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");
        LocalDateTime res = LocalDateTime.of(2020, 11, 24, 13, 0);
        System.out.println(res.format(drf));



    }
}
