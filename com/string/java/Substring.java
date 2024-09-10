package com.string.java;

import java.util.HashSet;
import java.util.Set;

public class Substring {
    public static void main(String[] args) {
        
        String inputString = "abcabcbb";
        
        
        int length = lengthOfLongestSubstring(inputString);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
    
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If the character is already in the set, remove characters from the left until it's not in the set
            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(left));
                left++;
            }
            
            // Add the current character to the set and update the maxLength
            charSet.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
