package day31_inheriance.animal_methodOverriding;



class A{
    int a = 100;
}

public class FieldHiding extends A{

    int a = 300;


    public static void main(String[] args) {
        System.out.println(new FieldHiding().a);

    }
}

