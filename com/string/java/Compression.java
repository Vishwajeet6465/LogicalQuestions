package com.string.java;

public class Compression {

    public static void main(String[] args) {
        String input = "aaaaaabbbcccc";
        String compressed = compressString(input);
        System.out.println("Original: " + input);
        System.out.println("Compressed: " + compressed);
    }

    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1; // Initialize count for the first character

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++; // Increment count if the same character repeats
            } else {
                compressed.append(input.charAt(i - 1)); // Append previous character
                compressed.append(count); // Append count of previous character
                count = 1; // Reset count for the new character
            }
        }

        // Append the last character and its count
        compressed.append(input.charAt(input.length() - 1));
        compressed.append(count);

        // Convert StringBuilder to String
        String compressedStr = compressed.toString();

        // Return the original string if compression is not effective
        return compressedStr.length() < input.length() ? compressedStr : input;
    }
}
