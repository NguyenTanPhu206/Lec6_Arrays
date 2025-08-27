package Lec6_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class FilterEvenNumbersArray_ArrayList5 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 == 0) {
                evenNumbers.add(numbers[i]);
            }
        }

        System.out.println("\nEven numbers in the array:");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
  
}
