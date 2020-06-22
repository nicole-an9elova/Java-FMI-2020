package com.jetbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Enter 1 for encryption or 2 for decryption: ");
            choice = input.nextInt();
        } while (choice < 1 || choice > 2);

        System.out.print("Write the key:");
        int code = input.nextInt();
        RouteCipher cipher = new RouteCipher(code);

        System.out.print("Write a word:");
        String text = input.next();
        text = text.toUpperCase();

        if (choice == 1) {
            System.out.println(cipher.encrypt(text));
        } else {
            System.out.println(cipher.decrypt(text));
        }
    }
}
