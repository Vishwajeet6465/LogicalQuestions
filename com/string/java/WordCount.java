package com.string.java;
import java.util.Scanner;

class WordCount {
    public static void main(String[] args) {
       
    	System.out.println("*** Word Counter ***");
    	Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        
        
        int wordCount = countWords(inputString);
        System.out.println("Number of words: " + wordCount);
        sc.close();
    }
    
    public static int countWords(String text) {
        // remove leading and trailing whitespace
        text = text.trim();
        
       
        if (text.isEmpty()) {
            return 0;
        }
        
        // Split the string by whitespace
        String[] words = text.split("\\s+");
        
        
        return words.length;
        
    }
}
