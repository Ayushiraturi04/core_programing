package level_two;

import java.util.Scanner;

public class Largest_secondLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the user input
        System.out.println("Enter the number");
        int number = sc.nextInt();

        // initially set to 10
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // loop to iterate until the number is not equal to 0
        while (number != 0) {
            digits[index] = number % 10;
            number /= 10;
            index++; // Increment the index by 1 in each iteration
            if (index == maxDigit) {
                break;
            }
        }
        
        // Store largest and second largest digit and initialize it to zero
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest) {
                secondLargest = digits[i];             // Display the Second largest element
            }
        }
        System.out.println("The largest digit is " + largest);
        System.out.println("The second largest digit is " + secondLargest);
    }
}
