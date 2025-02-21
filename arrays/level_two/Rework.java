package level_two;

import java.util.Scanner;

public class Rework {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        int maxDigit = 10; // Initial array size
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store them in an array
        while (number != 0) {
            // Increase array size dynamically if needed
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }

            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        // Find the largest and second-largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest) {
                secondLargest = digits[i];
            }
        }


        System.out.println("The largest digit is " + largest);
        System.out.println("The second largest digit is " + secondLargest);
    }
}
