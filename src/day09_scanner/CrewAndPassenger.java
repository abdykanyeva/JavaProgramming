package day09_scanner;

public class CrewAndPassenger {
    public static void main(String[] args) {

        int passenger = 50;
        String crewAndPassenger = (passenger == 50 || passenger == 75 || passenger == 100)?
                (passenger == 50)?"20 crew, 30 passenger" :(passenger == 75)?"25 crew, 50 passenger"
                        :"30 crew, 70 passenger"

                        :"Invalid input";
        System.out.println(crewAndPassenger);

        System.out.println("___________________________________________________");


        String result = "";
        switch(passenger){
            case 50:
                result = "20 crew, 30 passenger";
                break;
            case 75:
                result = "25 crew, 50 passenger";
                break;
            case 100:
                result = "30 crew, 70 passenger";
                break;
            default:
                result = "Invalid";

        }
        System.out.println(result);

    }
}
