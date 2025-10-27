package com.bogdan.homework;

import java.util.Scanner;

public class UsernameValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        boolean valid = false;

        do {
            System.out.print("Introdu un username: ");
            username = scanner.nextLine();

            if (username.length() < 6 || username.length() > 12) {
                System.out.println("Eroare: Username-ul trebuie sa aiba intre 6 si 12 caractere.\n");
                continue;
            }

            boolean hasSpace = false;
            for (int i = 0; i < username.length(); i++) {
                if (username.charAt(i) == ' ') {
                    hasSpace = true;
                    break;
                }
            }

            if (hasSpace) {
                System.out.println("Eroare: Username-ul nu poate contine spatii.\n");
                continue;
            }

            boolean hasDigit = false;
            for (int i = 0; i < username.length(); i++) {
                if (Character.isDigit(username.charAt(i))) {
                    hasDigit = true;
                    break;
                }
            }

            if (!hasDigit) {
                System.out.println("Eroare: Username-ul trebuie sa contina cel putin o cifra.\n");
                continue;
            }

            valid = true;

        } while (!valid);

        System.out.println("Username acceptat: " + username);
        scanner.close();
    }
}
