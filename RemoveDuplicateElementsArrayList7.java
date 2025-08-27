package Lec6_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateElementsArrayList7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> originalList = new ArrayList<>();
        ArrayList<Integer> uniqueList = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            originalList.add(num);
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
        System.out.println("\nOriginal list: " + originalList);
        System.out.println("List without duplicates: " + uniqueList);
    }
}
