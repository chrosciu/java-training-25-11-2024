package eu.chrost.javatraining.day5.lectures.wrappers;

public class Main {
    public static void main(String[] args) {
        int i = 3;
        Integer intObj = i; //boxing
        int iPrim = intObj; //unboxing

        increase(intObj);
        increaseObj(i);

        Integer dummy = null;
        increase(dummy);
    }

    private static int increase(int i) {
        return ++i;
    }

    private static int increaseObj(Integer i) {
        return ++i;
    }
}
