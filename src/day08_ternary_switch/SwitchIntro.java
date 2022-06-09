package day08_ternary_switch;

public class SwitchIntro {
    public static void main(String[] args) {
        int leapYear = 1800;

        if(leapYear % 4 == 0 && leapYear % 100 != 0){
            System.out.println("This is leapYear");

        }else if(leapYear % 400 == 0 && leapYear % 100 == 0 && leapYear % 4 == 0){
            System.out.println("THIS IS LEAP YEAR");
        }else{
            System.out.println("Not");
        }


    }
}
/*
A: excellent
b: great job
c: good
d: passed
f: failed
 */
