package com.ghostfacedlabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase to translate:");
        String phrase = scanner.nextLine();

        String[] parts = phrase.split(" ");

        for (String part : parts) {
            System.out.print(translate(part) + " ");
        }

    }

    public static String translate(String s) {
        return s.substring(1) + "-" + s.charAt(0) + "ay";
    }
}
