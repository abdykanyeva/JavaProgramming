package day18_garbageCollection;

public class TestPizzaObjects {
    public static void main(String[] args) {

        Pizza pepperoni = new Pizza();
        pepperoni.setInfo('s', 2, 1);

        Pizza pizza2 = new Pizza();
        pizza2.size = 'm';

        pizza2.setInfo('m', 3,  2);
        System.out.println();

        System.out.println(pepperoni);
        System.out.println(pizza2);

double total = 0;
        for (int i = 0; i < 20; i++) {
            Pizza small = new Pizza();
            small.setInfo('s', 2, 2);
            total += small.totalCost();

            Pizza large = new Pizza();
            large.setInfo('l', 4, 5);
            total += large.totalCost();

            Pizza medium = new Pizza();
            medium.setInfo('m', 2, 1);
            total += medium.totalCost();



        }


    }
}
