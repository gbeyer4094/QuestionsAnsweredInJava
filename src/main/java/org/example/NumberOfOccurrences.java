package org.example;

public class NumberOfOccurrences {
    public static long countOccurrences(String str, char ch) {
        return str.chars().filter(c -> c == ch).count();
    }

    public static void main(String[] args) {
        String inputString = "Hello, how are you?";
        char targetChar = 'o';
        long occurrences = countOccurrences(inputString, targetChar);
        System.out.println("Number of occurrences of '" + targetChar + "': " + occurrences);
    }

}
