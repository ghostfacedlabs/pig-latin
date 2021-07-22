package com.ghostfacedlabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase to translate");
        String phrase = scanner.nextLine();

        String[] parts = phrase.split(" ");
        System.out.println("Translation");
        for (String part : parts) {
            System.out.print(translate(part) + " ");
        }

    }

    public static String translate(String s) {
        s = s.toLowerCase();
        if (s.length() < 4) {
            return s + "yay";
        } else {
            return s.substring(1) + s.charAt(0) + "ay";
        }
    }
}
