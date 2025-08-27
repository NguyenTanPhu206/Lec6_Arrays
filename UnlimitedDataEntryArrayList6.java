package Lec6_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class UnlimitedDataEntryArrayList6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int input;
        int sum = 0;

        System.out.println("Enter integers (type -1 to stop):");

        while (true) {
            System.out.print("Number: ");
            input = scanner.nextInt();
            if (input == -1) break;
            numbers.add(input);
            sum += input;
        }

        System.out.println("\nYou entered: " + numbers);
        System.out.println("Total sum: " + sum);
    }
}
