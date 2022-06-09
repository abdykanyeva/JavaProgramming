package day20_arrayUtility;

import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {

        int [] score = {70, 100, 80, 90, 65};

        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score);
        System.out.println(result);


        System.out.println("__________________________________________________");

        int [] a1 = {1, 2, 3, 4, 5};
        int [] a2 = {1, 2, 3, 4, 5};


        boolean r1 = Arrays.equals(a1, a2);

        System.out.println(r1);


        char [] ch = {'A', 'B', 'C'};
        char [] ch2 = {'A', 'C', 'B'};

        boolean res =  Arrays.equals(ch, ch2);
        System.out.println(res);



        String [] s1 = {"A", "B", "C"};
        String [] s2 = {"A", "C", "B"};

        System.out.println(Arrays.equals(s1, s2));

        System.out.println("_________________________________________________________");


        int [] nums = {100, 80, 90, 75, 88, 4, 47, 52, 98, 66, 500};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("Minimum number: " + nums[0]);
        System.out.println("Maximum number: " + nums[nums.length - 1]);

        System.out.println("_____________________________________________________________");


        String [] students = {"Madiyar", "Ali", "Abidullah", "Alena"};
        System.out.println(Arrays.toString(students));

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("_____________________________________________________________________");


        int [] array = {10, 20, 30, 40, 50, 60, 70};

        int [] array2 = Arrays.copyOf(array, array.length);

        System.out.println(Arrays.toString(array2));



        int [] n1 = {1, 2, 3,4, 5};
        int [] n2 = {6, 7, 8, 9, 10, 11, 12};

        int [] n3 = Arrays.copyOf(n1, n2.length + n1.length);

        for (int i = 0, j = n1.length; i < n2.length; i++, j++) {
            n3[j] = n2[i];

        }


        System.out.println(Arrays.toString(n3));


        System.out.println("__________________________________________");


        char [] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        char [] result1 = Arrays.copyOf(ch, 4);

        System.out.println(Arrays.toString(result1));

        char [] res1 = Arrays.copyOfRange(ch, 2, 4);

        System.out.println(Arrays.toString(res1));








    }
}
