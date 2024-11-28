package eu.chrost.javatraining.day4.lectures.libraries;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/*

Zadanie: rozszerzyc dzialanie klasy StringUtilityDemo

- wczytac z konsoli pojedynczy znak
   hint: wczytuje sie zawsze cala linia, wiec trzeba wziac z niej pierwsdzy znak - charAt()
   hint: pojedynczy znak jest typu char
- sprawdzic ile razy wczytany znak wystepuje we wczytanej juz wczesniej i sprawdzonej linii
   hint: wykorzystac w tym celu metode countMatches() z klasy StringUtils()
- wyswietlic wynik
 */

public class StringUtilityDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter line:");
        String line = scanner.nextLine();

        if (StringUtils.isBlank(line)) {
            System.out.println("Line is blank, terminating");
            return;
        }

        System.out.println("Line is correct, to be continued...");

        //wczytanie znaku

        //sprawdzenie ile razy znak wystapil w linii

        //wyswietlic wynik
    }
}
