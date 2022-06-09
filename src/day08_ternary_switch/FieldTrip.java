package day08_ternary_switch;

public class FieldTrip {
    public static void main(String[] args) {
            int grade = 100;
            String location = "unknown";
            int numberOfGroups = 0;
            String teachersName = "unknown";

            if(grade >= 1 && grade <= 6){
                if (grade == 1) {
                    location = "Apple Orchard";
                    numberOfGroups = 3;
                    teachersName = "Ms. Smith";
                }else if(grade == 2){
                    location = "Zoo";
                    numberOfGroups = 7;
                    teachersName = "Mr.Lee";
                }else if (grade == 3){
                    location = "Aquarium";
                    numberOfGroups = 5;
                    teachersName = "Mr. Kira";
                }else if(grade == 4){
                    location = "Movie theater";
                    numberOfGroups = 2;
                    teachersName = "Ms.Reye";
                }
                else if(grade == 5){
                    location = "Museum";
                    numberOfGroups = 5;
                    teachersName = "Ms.Leyla";
                }else{
                    location = "Siz Flags";
                    numberOfGroups = 7;
                    teachersName = "Mr.Ali";
                }

            }
        System.out.println("Local " + location);
        System.out.println("Number of groups " + numberOfGroups);
        System.out.println("Teacher in charge " + teachersName);
    }
}
