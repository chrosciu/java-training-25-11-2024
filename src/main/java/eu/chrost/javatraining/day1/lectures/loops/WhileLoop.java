package eu.chrost.javatraining.day1.lectures.loops;

/*
Zadanie: wypisac liczby od 1 do 10
 */

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i = i + 1;
        }
    }
}
