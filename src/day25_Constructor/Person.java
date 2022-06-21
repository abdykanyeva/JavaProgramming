package day25_Constructor;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;
    public boolean isMarried;
    public boolean isEmployed;

    public Person(String name, char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployed){
        this.name = name;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }


    public void eat(Scanner food){
        System.out.println(this.name + " is eating " + food);
    }

    public void drink(Scanner drink){
        System.out.println(this.name + " is drinking " + drink);
    }

    public void sleeping(){
        System.out.println(name + " is sleeping");
    }
}
