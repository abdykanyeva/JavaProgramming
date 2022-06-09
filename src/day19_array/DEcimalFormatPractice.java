package day19_array;

import java.text.DecimalFormat;

public class DEcimalFormatPractice {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.000");

        double n1 = 10.58777;

        System.out.println(df.format(n1));
    }
}
