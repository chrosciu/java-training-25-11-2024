package eu.chrost.javatraining.day5.lectures.interfaces.runnable;

class Action implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new Action();
        Thread t = new Thread(runnable);
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
