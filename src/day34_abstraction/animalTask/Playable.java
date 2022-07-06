package day34_abstraction.animalTask;

public interface Playable {

    boolean isFriendly = true;  // static & final
/*
    private static void main(String[] args) {   static method
        System.out.println(isFriendly);
    }


    default void method1(){      default method

    }

 */


     void play();   // abstract method



}
