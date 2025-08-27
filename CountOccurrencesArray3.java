package Lec6_Arrays;

import java.util.Scanner;

public class CountOccurrencesArray3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to count: ");
        int x = scanner.nextInt();
        int count = 0;
        for (int num : arr) {
            if (num == x) count++;
        }
        System.out.println("The number " + x + " appears " + count + " times.");
    }
}
