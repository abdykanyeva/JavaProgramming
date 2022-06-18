package day25_Constructor;

public class TestRectangleObjects {

    public static void main(String[] args) {
        /*

        Rectangle rectangle = new Rectangle();
        rectangle.setInfo(3, 4);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(3, 2);

        Rectangle rectangle3 = new Rectangle();
        rectangle3.setInfo(5, 6);

        Rectangle rectangle4 = new Rectangle();

         */

        Rectangle rectangle1 = new Rectangle(5, 6);

        Rectangle rectangle2 = new Rectangle(6, 6);

        Rectangle rectangle3 = new Rectangle(4, 6);

        Rectangle rectangle4 = new Rectangle(7, 6);






        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(rectangle4);


    }
}
