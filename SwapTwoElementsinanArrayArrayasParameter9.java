package Lec6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapTwoElementsinanArrayArrayasParameter9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter first index to swap (0 to " + (n - 1) + "): ");
        int i = scanner.nextInt();
        System.out.print("Enter second index to swap (0 to " + (n - 1) + "): ");
        int j = scanner.nextInt();

        if (i >= 0 && i < n && j >= 0 && j < n) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            System.out.println("Array after swapping:");
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("Invalid indices. No swap performed.");
        }
    }
}
