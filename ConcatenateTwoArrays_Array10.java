package Lec6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenateTwoArrays_Array10 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements for the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
    System.out.print("Enter size of second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements for the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        int[] result = new int[n1 + n2];
        System.arraycopy(arr1, 0, result, 0, n1);
        System.arraycopy(arr2, 0, result, n1, n2);
        System.out.println("Concatenated array:");
        System.out.println(Arrays.toString(result));
    }
}
