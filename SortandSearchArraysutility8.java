package Lec6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortandSearchArraysutility8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.print("Enter a number to search: ");
        int x = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println(x + " found at index " + index + " in the sorted array.");
        } else {
            System.out.println(x + " not found in the array.");
        }
    }
}
