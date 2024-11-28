package eu.chrost.javatraining.day2.lectures.methods;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1));
        System.out.println(sum(1, 3));
        System.out.println(sum(1, 4, 7));

        displaySum("Sum: ", 1, 3);
        displaySum("Empty Sum: ");
    }

    public static int sum(int... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }

    public static void displaySum(String prefix, int... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        System.out.println(prefix + sum);
    }
}
