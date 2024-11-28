package eu.chrost.javatraining.day4.lectures.libraries;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

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
    }
}
