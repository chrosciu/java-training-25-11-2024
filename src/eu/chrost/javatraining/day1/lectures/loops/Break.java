package eu.chrost.javatraining.day1.lectures.loops;

public class Break {
    public static void main(String[] args) {
        int i = 1;

        while (true) {
            System.out.println(i);
            i = i + 1;
            if (i == 10) {
                break;
            }
        }

    }
}
