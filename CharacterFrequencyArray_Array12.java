package Lec6_Arrays;

import java.util.Scanner;

public class CharacterFrequencyArray_Array12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();

        int[] freq = new int[26]; 

        for (char c : input.toCharArray(
       )) {
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }
        System.out.println("\nCharacter frequencies:");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char)(i + 'a') + ": " + freq[i]);
            }
        }
    }
}
