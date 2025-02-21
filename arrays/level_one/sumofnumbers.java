package level_one;

import java.util.Scanner;

public class sumofnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        double[] numbers = new double[10];
        double sum = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();

            if (num <= 0 || index == 10)
                break;
            numbers[index++] = num;
        }

        // Summing the numbers
        for (int i = 0; i < index; i++) {
            sum += numbers[i];
        }


        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSum: " + sum);

    }
}
