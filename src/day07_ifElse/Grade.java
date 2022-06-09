package day07_ifElse;

public class Grade {
    public static void main(String[] args) {

        char grade = 'B';
        String result = "";

        if(grade  == 'A'){
            result = "passed";
        }
        else if(grade == 'B'){
            result = "Great job";
        }
        else if(grade == 'C'){
            result = "good job";
        }
        else if(grade == 'D'){
            result = "not bad";
        }
        else if(grade == 'E'){
            result = "Bad";
        }
        System.out.println(result);

    }
}
