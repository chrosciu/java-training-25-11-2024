package eu.chrost.javatraining.day2.lectures.arrays;

public class ProgramArguments {
    public static void main(String[] args) {
        System.out.println(args.length);
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
