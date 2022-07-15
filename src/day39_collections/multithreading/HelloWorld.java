package day39_collections.multithreading;

public class HelloWorld extends Thread{    // 1. Thread class 2. Runnable interface


    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello World: "+ i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
