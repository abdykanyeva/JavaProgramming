package day22_arrayList;

public class MinMaxNumber {

    public static void main(String[] args) {

      int [][]  array = { {100, 20000, 300}, {10, 1000, 50}, {-200, 400, 0} };

        int max = 0;
        int min = 0;
      for(int[] each:array){
          for(int each1:each){ // each1: each element
              if(max < each1){
                  max = each1;
              }
              if(min > each1){
                  min = each1;
              }
          }

      }
        System.out.println(max);
        System.out.println(min);




    }
}
