package day16_nestedLOop;

public class CharFreq {
    public static void main(String[] args) {

        String str = "aabcccd"; //

        String result = " ";


        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if(each == str.charAt(j)){
                    frequency++;

                }
            }
            if(result.contains(each + "")){ // if the character is already included in the result
                continue; // skip that char
            }
            result += each + " " + frequency;

        }

        System.out.println(result);





    }


}
