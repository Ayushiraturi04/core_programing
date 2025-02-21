package level_two;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.println("Enter the number of students: "); // Prompt the user to enter the number of students
        int n = sc.nextInt(); // Read the number of students

        // Generate random scores for students
        int[][] scores = generateScores(n);

        // Calculate total, average, and percentage
        double[][] results = calculateResults(scores);

        // Determine grades based on percentage
        String[][] grades = calculateGrades(results);

        // Display the final scorecard
        displayScorecard(scores, results, grades);
    }

    // Method to generate random scores for students
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3]; // Create a 2D array for student scores in three subjects

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 101); // Generate random scores between 0 and 100
            }
        }
        return scores; // Return the generated scores
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4]; // Create a 2D array to store results

        for (int i = 0; i < scores.length; i++) {
            results[i][0] = scores[i][0] + scores[i][1] + scores[i][2]; // Calculate total marks
            results[i][1] = Math.round(results[i][0] / 3.0 * 100) / 100.0; // Calculate average and round off
        }
        return results; // Return results array
    }

    // Method to assign grades based on percentage
    public static String[][] calculateGrades(double[][] results) {
        String[][] grades = new String[results.length][2]; // Create a 2D array for grades and percentage

        for (int i = 0; i < results.length; i++) {
            if (results[i][1] >= 90) {
                grades[i][0] = "A"; // Assign grade A
            } else if (results[i][1] >= 80) {
                grades[i][0] = "B"; // Assign grade B
            } else if (results[i][1] >= 70) {
                grades[i][0] = "C"; // Assign grade C
            } else if (results[i][1] >= 60) {
                grades[i][0] = "D"; // Assign grade D
            } else {
                grades[i][0] = "F"; // Assign grade F (Fail)
            }
            grades[i][1] = results[i][1] + "%"; // Store percentage as string
        }
        return grades; // Return grades array
    }

    // Method to display the final scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade"); // Print header

        for (int i = 0; i < scores.length; i++) {
            // Print student details along with scores, results, and grades
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t"
                    + results[i][0] + "\t" + results[i][1] + "\t" + grades[i][1] + "\t" + grades[i][0]);
        }
    }
}