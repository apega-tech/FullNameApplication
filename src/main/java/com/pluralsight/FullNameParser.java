package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your whole name: ");
        String input = scanner.nextLine().trim();
        String[] parts = input.split("\\s+");

        String firstName = "";
        String middleName = "(none)";
        String lastName = "";

        if (parts.length == 2){
            firstName = parts[0];
            lastName = parts[1];
        } else if (parts.length == 3) {
            firstName = parts[0];
            middleName = parts[1];
            lastName = parts[2];
        }

        System.out.println("First name: " + firstName);
        System.out.println("Midlle name: " + middleName);
        System.out.println("Last name: " + lastName);

        scanner.close();
    }
}
