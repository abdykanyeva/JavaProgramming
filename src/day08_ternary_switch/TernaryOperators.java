package day08_ternary_switch;

public class TernaryOperators {
    public static void main(String[] args) {
        int score = 85;
        String result = "";
        if(score >= 60){
            result = "Passed";
        }else{
            result = "Failed";
        }
        System.out.println(result);
        System.out.println("_______________________________________________________");

        String result2 = (score >= 60) ?"Passed" : "Failed";
        System.out.println(result2);
        System.out.println("__________________________________________________________");

        int age = 34;
        String r;
//        if(age >= 21){
//            r = "Eligible";
//        }
//        else{
//            r = "not eligible";
//        }
        String result3 = (age >= 21) ? "Eligible":"Not Eligible";
        System.out.println(result3);
    }
}
