package Lec6_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConvertBetweenArrayandArrayList15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements for the array: ");
        int n = scanner.nextInt();
        String[] arr = new String[n];
        scanner.nextLine(); 

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        ArrayList<String> listFromArray = new ArrayList<>(Arrays.asList(arr));
        System.out.println("\nConverted ArrayList: " + listFromArray);

        System.out.print("\nEnter number of elements for the ArrayList: ");
        int m = scanner.nextInt();
        scanner.nextLine(); // consume newline
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Enter " + m + " strings:");
        for (int i = 0; i < m; i++) {
            list.add(scanner.nextLine());
        }

        String[] arrayFromList = list.toArray(new String[0]);
        System.out.println("\nConverted Array: " + Arrays.toString(arrayFromList));
    }
}
