package eu.chrost.javatraining.day5.lectures.interfaces.runnable;

public class Race {
    private int counter = 0;

    class Incrementer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter = counter + 1;
            }
        }
    }

    class Decrementer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter = counter - 1;
            }
        }
    }

    public void execute() {
        Runnable incrementer = new Incrementer();
        Runnable decrementer = new Decrementer();
        Thread thread1 = new Thread(incrementer);
        Thread thread2 = new Thread(decrementer);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        Race race = new Race();
        race.execute();
    }
}
