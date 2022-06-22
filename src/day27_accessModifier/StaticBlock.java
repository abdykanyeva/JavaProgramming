package day27_accessModifier;

public class StaticBlock {

    public StaticBlock(){
        System.out.println("Constructor");
    }

    static{
        System.out.println("Static Block");
    }


    public static void main(String[] args) {
        System.out.println("Main Method");

        new StaticBlock();
        new StaticBlock();
    }


}
