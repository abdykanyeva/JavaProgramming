package day36_polymorphism;


import day30_inheritance.phone.Iphone;
import day30_inheritance.phone.Nokia;
import day30_inheritance.phone.Phone;
import day30_inheritance.phone.Samsung;

public class PhonePractice {

    public static void main(String[] args) {


        Phone[] phones = {
                new Iphone("Iphone 11 Pro", "Large", 1000.5, "Black"),
                new Iphone("Iphone 12 Pro Max", "Large", 1000.5, "Black"),
                new Iphone("Iphone 9", "Medium", 800, "Gold" ),
                new Samsung("Galaxy S19", "Medium", 700, "Silver"),
                new Samsung("Galaxy S20", "Large", 850, "Silver"),
                new Samsung("Galaxy S21", "Large",950 ,"Silver"),
                new Nokia("XR20", "Small", 350,"Black"),
                new Nokia("G10", "Medium", 99,"Black"),
                new Nokia("G50", "Large", 250, "Silver"),
                new Iphone("Iphone 12 Pro", "Large", 1200, "Black"),
                new Iphone("Iphone 11 Pro Max", "Large", 1100, "Silver"),
                new Samsung("Galaxy S18", "Medium", 750, "White"),
                new Samsung("Galaxy S17", "Large", 650,"Silver"),
                new Nokia("G10", "Medium", 99, "Black"),
                new Iphone("Iphone 6", "Smalle", 400, "Gold"),
                new Iphone("Iphone 7", "Smalle", 500, "White")
        };

        // model - color - price
        for(Phone each: phones){
            System.out.println(each.getModel() + " - " + each.getColor() + " - " + each.getPrice());
        }
        int countIphone = 0;
        int countSamsung = 0;

        for(Phone each: phones){
            if(each instanceof Iphone){
                countIphone++;
            }else if(each instanceof Samsung){
                countSamsung++;
            }
        }
        System.out.println(countIphone);
        System.out.println(countSamsung);


        System.out.println("_______________________________________");

        for(Phone each:phones){
            if( each instanceof Phone || each instanceof Samsung ){ // if the phone is Iphone or samsung
                if(each.getPrice() >= 700){
                    System.out.println(each.getModel());
                }
            }
        }

    }


}
