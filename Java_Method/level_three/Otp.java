package level_three;

import java.util.Arrays;

public class Otp {

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; // Generates a random number between 100000 and 999999
    }

    // Method to check if all OTPs in the array are unique
    public static boolean areOTPNumbersUnique(int[] otpNumbers) {
        // Iterate through the array and compare each OTP with the others
        for (int i = 0; i < otpNumbers.length; i++) {
            for (int j = i + 1; j < otpNumbers.length; j++) {
                if (otpNumbers[i] == otpNumbers[j]) { // If duplicate found, return false
                    return false;
                }
            }
        }
        return true; // If no duplicates, return true
    }

    // Main method to test the OTP generation and uniqueness check
    public static void main(String[] args) {
        int[] otpNumbers = new int[10]; // Array to store 10 OTPs

        // Generate and store 10 OTPs
        for (int i = 0; i < otpNumbers.length; i++) {
            otpNumbers[i] = generateOTP();
        }

        // Display the generated OTPs
        System.out.println("Generated OTP Numbers: " + Arrays.toString(otpNumbers));

        // Check if all OTPs are unique
        System.out.println("Are OTP Numbers Unique? " + areOTPNumbersUnique(otpNumbers));
    }
}
