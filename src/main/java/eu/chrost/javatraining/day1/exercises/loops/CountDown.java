package eu.chrost.javatraining.day1.exercises.loops;

/*
Zadanie 5: Odliczanie
1.	Wypisz liczby od 10 do 1, używając pętli for oraz operatora dekrementacji (--).
2.	Następnie zmień program, aby używać pętli while.

 */

public class CountDown {
    public static void main(String[] args) {
        for (int i = 10; i > 0; --i) {
            System.out.println(i);
        }
    }
}
