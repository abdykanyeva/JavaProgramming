package day17_customClass;

public class UniqueChar2 {
    public static void main(String[] args) {

        String str = "aabcccd"; // bd

        String unique = " ";


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int frequency = 0;


            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(0)){
                    frequency ++;
                }
            }
            if(frequency == 3){
                unique += ch;
            }


        }
        System.out.println(unique);





    }
}



/*

Str = "aabcccd
output: bd


 */