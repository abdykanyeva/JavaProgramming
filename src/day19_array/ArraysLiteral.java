package day19_array;

import java.util.Arrays;

public class ArraysLiteral {

    public static void main(String[] args) {
        int []numbers = new int[5];

        int [] nums = {1, 2, 3, 4, 5};

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("(numbers) = " + Arrays.toString(numbers));
        System.out.println("(nums) = " + Arrays.toString(nums));

        System.out.println("_____________________________________________________________________________");

        String [] days = {"Monday", "Tuesday", "Wednesday", "THursday", "Friday", "Saturday", "Sunday"};
        int n = 5;

        System.out.println(days[n -1]);

        System.out.println("______________________________________________________________________");

        String [] month = {"January", "February", "March", "April", "May", "June", "JUly", "August", "September", "Oct", "Nov", "Dec"};

        System.out.println("month = " +Arrays.toString(month));


        for (int i = month.length - 1; i >= 0; i--) {
            System.out.println(month[i]);
        }



    }
}
