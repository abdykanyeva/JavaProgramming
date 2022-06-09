package day08_ternary_switch;

public class Elevator {
    public static void main(String[] args) {
        int floorNUmber = 10;


        if(floorNUmber >= 1 && floorNUmber <=3 ) {
            if(floorNUmber == 1){
                System.out.println("Floor 1 is selected");
            }else if(floorNUmber == 2){
                System.out.println("Floor 2 is selected");
            }else{
                System.out.println("Floor 3 is selected");
            }

        }else {
            System.out.println("Invalid floor");
    }

    }

}
