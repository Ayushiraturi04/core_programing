package level_two;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Create a 2D array to store the weight, height, and BMI of 10 people
        double[][] persons = new double[10][3];

        // Loop to get the weight and height of 10 people from user input
        for (int i = 0; i < persons.length; i++) {
            // Prompt user to enter weight for each person
            System.out.println("Enter weight of person " + (i + 1) + " in kg: ");
            persons[i][0] = sc.nextDouble(); // Store weight in first column

            // Prompt user to enter height for each person
            System.out.println("Enter height of person " + (i + 1) + " in cm: ");
            persons[i][1] = sc.nextDouble(); // Store height in second column
        }

        // Call method to calculate BMI for each person
        findBMI(persons);

        // Call method to determine the BMI status of each person
        String[] status = findBMIStatus(persons);

        // Loop to display the BMI and status of each person
        for (int i = 0; i < persons.length; i++) {
            System.out.println("Person " + (i + 1) +
                    " | Weight: " + persons[i][0] + " kg" +
                    " | Height: " + persons[i][1] + " cm" +
                    " | BMI: " + persons[i][2] +
                    " | Status: " + status[i]);
        }
    }

    static void findBMI(double[][] persons) {
        for (int i = 0; i < persons.length; i++) {
            double weight = persons[i][0]; // Retrieve weight in kg
            double height = persons[i][1] / 100; // Convert height from cm to meters
            double bmi = weight / (height * height); // BMI formula: weight / height²
            persons[i][2] = bmi; // Store the calculated BMI in the third column
        }
    }

    static String[] findBMIStatus(double[][] persons) {
        String[] status = new String[persons.length]; // Array to store BMI status

        for (int i = 0; i < persons.length; i++) {
            double bmi = persons[i][2]; // Retrieve BMI value
            // Categorizing BMI status based on standard BMI ranges
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 24.9 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }
        return status; // Return the array containing BMI status for all persons
    }
}
