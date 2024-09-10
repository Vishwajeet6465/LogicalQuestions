package com.string.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagrams {
    public static void main(String[] args) {
        
        String s = "cbaebabacd";
        String p = "abc";
        

        List<Integer> result = findAnagrams(s, p);
        System.out.println("Starting indices of p's anagrams in s: " + result);
    }
    
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        
        if (s.length() < p.length()) {
            return result;
        }
        
        Map<Character, Integer> pCount = new HashMap<>();
        Map<Character, Integer> sCount = new HashMap<>();
        
        // Initialize the frequency maps for p and the first window in s
        for (char c : p.toCharArray()) {
            pCount.put(c, pCount.getOrDefault(c, 0) + 1);
        }
        
        int pLength = p.length();
        for (int i = 0; i < s.length(); i++) {
            // Add the current character to the window
            char currentChar = s.charAt(i);
            sCount.put(currentChar, sCount.getOrDefault(currentChar, 0) + 1);
            
            // Remove the character that is sliding out of the window
            if (i >= pLength) {
                char charToRemove = s.charAt(i - pLength);
                if (sCount.get(charToRemove) == 1) {
                    sCount.remove(charToRemove);
                } else {
                    sCount.put(charToRemove, sCount.get(charToRemove) - 1);
                }
            }
            
            // Compare window with p's frequency map
            if (sCount.equals(pCount)) {
                result.add(i - pLength + 1);
            }
        }
        
        return result;
    }
}

