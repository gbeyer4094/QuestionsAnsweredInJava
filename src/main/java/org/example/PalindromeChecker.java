package org.example;

public class PalindromeChecker {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed); // Case-insensitive comparison
    }

    public static void main(String[] args) {
        String s1 = "racecar";

        boolean result = isPalindrome(s1);
        System.out.println("Is " + s1 + " a palindrome: " + result);
    }

}
