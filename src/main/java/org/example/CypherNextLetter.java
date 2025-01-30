package org.example;

import java.util.Scanner;

public class CypherNextLetter {

    public static String nextLetterCypher(String message) {
        // Define the normal and reversed alphabets
        String normalAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String reversedAlphabet = "bcdefghijklmnopqrstuvwxyza";

        // Convert the message to lowercase for simplicity
        message = message.toLowerCase();

        // Build the encrypted message
        StringBuilder encryptedMessage = new StringBuilder();

        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch)) {
                // Find the index in the normal alphabet
                int index = normalAlphabet.indexOf(ch);
                // Append the corresponding letter from the reversed alphabet
                encryptedMessage.append(reversedAlphabet.charAt(index));
            } else {
                // Keep non-letter characters unchanged
                encryptedMessage.append(ch);
            }
        }

        return encryptedMessage.toString();
    }

    public static void main(String[] args) {
        System.out.println("Enter the coded message?");

        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String encryptedMessage = nextLetterCypher(message);

        System.out.println("Original Message: " + message);
        System.out.println("Encrypted Message: " + encryptedMessage);
    }
}
