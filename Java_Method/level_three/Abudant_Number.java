package level_three;

import java.util.Arrays;

public class Abudant_Number {

    public static void main(String[] args) {
        int number = 28; // Example number

        // Find and display factors of the number
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));

        // Find and display the greatest factor
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));

        // Find and display the sum of the factors
        System.out.println("Sum of Factors: " + sumOfFactors(factors));

        // Find and display the product of the factors
        System.out.println("Product of Factors: " + productOfFactors(factors));

        // Find and display the product of cubes of the factors
        System.out.println("Product of Cubes of Factors: " + productOfCubeOfFactors(factors));

        // Check and display if the number is a perfect number
        System.out.println(number + " is a Perfect Number: " + isPerfectNumber(number));

        // Check and display if the number is an abundant number
        System.out.println(number + " is an Abundant Number: " + isAbundantNumber(number));

        // Check and display if the number is a deficient number
        System.out.println(number + " is a Deficient Number: " + isDeficientNumber(number));

        // Check and display if the number is a strong number
        System.out.println(number + " is a Strong Number: " + isStrongNumber(number));
    }

    // Method to find all factors of a number and return them as an array.
    public static int[] findFactors(int num) {
        int count = 0;

        // Count the number of factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Store factors in an array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number.
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 2]; // Second last element is the greatest factor (excluding itself)
    }

    // Method to find the sum of the factors.
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors.

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of cubes of the factors.
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number.
    public static boolean isPerfectNumber(int num) {
        int sum = sumOfFactors(findFactors(num)) - num; // Sum of proper divisors
        return sum == num;
    }

    // Method to check if a number is an abundant number.
    public static boolean isAbundantNumber(int num) {
        int sum = sumOfFactors(findFactors(num)) - num;
        return sum > num;
    }

    // Method to check if a number is a deficient number.
    public static boolean isDeficientNumber(int num) {
        int sum = sumOfFactors(findFactors(num)) - num;
        return sum < num;
    }

    // Method to check if a number is a strong number.
    public static boolean isStrongNumber(int num) {
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            sum += factorial(temp % 10); // Get the factorial of the digit and add to sum
            temp /= 10;
        }
        return sum == num;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
