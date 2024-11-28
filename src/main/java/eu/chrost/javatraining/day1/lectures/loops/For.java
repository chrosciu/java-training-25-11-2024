package eu.chrost.javatraining.day1.lectures.loops;

public class For {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i = i + 1) {
            if (i == 7) {
                continue;
            }
            if (i == 8) {
                break;
            }
            System.out.println(i);
        }
    }
}
