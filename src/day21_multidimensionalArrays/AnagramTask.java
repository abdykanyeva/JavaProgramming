package day21_multidimensionalArrays;

public class AnagramTask {
    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "eart";

        char [] str3 = str1.toCharArray();
        char [] str4 = str2.toCharArray();

        for (int i = 0; i < str3.length; i++) {

            int count = 0;
            for (int j = 0; j < str4.length; j++) {
                if(str3[i] == str4[j]){
                    count++;

                }
            }if(count == 1){
                System.out.println(true);
            }else{
                System.out.println(false);
            }



        }

    }
}
