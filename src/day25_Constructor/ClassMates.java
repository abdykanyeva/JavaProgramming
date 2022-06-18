package day25_Constructor;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ClassMates {

    public static void main(String[] args) {

        String [] classmates = {"Ahmet"," Boban", "Dilara", " Entisar", "Evgeniya"};

        LocalDate [] dateOfBirth = {LocalDate.of(1993, 4, 16), LocalDate.of(2000, 11, 8),
        LocalDate.of(1989, 7, 4), LocalDate.of(1986, 9, 17), LocalDate.of(1987, 2, 10)};


        LocalDate young = Collections.max(Arrays.asList(dateOfBirth));
        int indexOfname =0;


        for(int i =0; i < classmates.length; i++){
            if(dateOfBirth[i].isLeapYear()){
                System.out.println(classmates[i] + " was born on Leap year");
            }
            if(dateOfBirth[i] == young){
                indexOfname = i;
            }
        }
        System.out.println("The youngest person is: " + classmates[indexOfname]);




    }
}
