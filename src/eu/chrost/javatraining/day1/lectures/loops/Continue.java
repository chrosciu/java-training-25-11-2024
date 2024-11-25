package eu.chrost.javatraining.day1.lectures.loops;

public class Continue {
    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            i = i + 1;
            if (i == 7) {
                continue;
            }
            System.out.println(i);
        }
    }
}
