package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aabbccddd";

        String result = "";

        String [] res = str.split("");

        for(String each : str.split("")){
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            if(!result.contains(each)){
                result += each + frequency;
        }
        }
    }




}
