package level_two;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Create an array to store the ages of 10 students
        int[] ages = new int[10];

        // Loop to get the age of each student from the user
        for (int i = 0; i < 10; i++) {
            // Prompt the user to enter the age of each student
            System.out.println("Enter the age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt(); // Store the entered age in the array
        }

        // Call the method to determine voting eligibility based on age
        String[][] ageVote = findAgeVote(ages);

        // Display the age and voting eligibility table
        displayTable(ageVote);
    }

    // Method to determine whether each student can vote based on their age
    public static String[][] findAgeVote(int[] ages) {
        // Create a 2D array to store the age and vote eligibility for each student
        String[][] ageVote = new String[10][2];

        // Loop through the ages array and determine the voting eligibility
        for (int i = 0; i < 10; i++) {
            // Check if the entered age is invalid (negative)
            if (ages[i] < 0) {
                ageVote[i][0] = Integer.toString(ages[i]); // Store the invalid age
                ageVote[i][1] = "Invalid Age"; // Mark it as invalid
            }
            // Check if the student is eligible to vote (18 or older)
            else if (ages[i] >= 18) {
                ageVote[i][0] = Integer.toString(ages[i]); // Store the age
                ageVote[i][1] = "Can Vote"; // Mark it as eligible to vote
            }
            // If the student is under 18, they cannot vote
            else {
                ageVote[i][0] = Integer.toString(ages[i]); // Store the age
                ageVote[i][1] = "Cannot Vote"; // Mark it as not eligible to vote
            }
        }
        // Return the 2D array containing the age and voting eligibility
        return ageVote;
    }

    // Method to display the age and voting eligibility table
    public static void displayTable(String[][] ageVote) {
        // Print the table header
        System.out.println("Age\tCan Vote");

        // Loop through the ageVote array and print each student's age and eligibility
        for (int i = 0; i < 10; i++) {
            System.out.println(ageVote[i][0] + "\t" + ageVote[i][1]);
        }
    }
}
