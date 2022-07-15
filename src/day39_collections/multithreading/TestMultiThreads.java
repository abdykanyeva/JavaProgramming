package day39_collections.multithreading;

public class TestMultiThreads {

    public static void main(String[] args) {

        Thread thread1 = new HelloWorld();


        Thread thread2 = new HelloWorld();

        thread1.start();
        thread2.start();


    }
}
