package level_two;

import java.util.Scanner;

public class two_person_BMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number of persons
        System.out.println("Enter the number of persons:");
        int persons = sc.nextInt();

        // 2D array to store weight, height, and BMI
        double[][] personData = new double[persons][3];
        String[] weightStatus = new String[persons];

        // Input loop for weight and height
        for (int i = 0; i < persons; i++) {
            // Input validation for weight
            do {
                System.out.println("Enter the weight (kg) of person " + (i + 1) + ":");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] < 0) {
                    System.out.println("Invalid input! Weight must be positive.");
                }
            } while (personData[i][0] < 0);

            // Input validation for height
            do {
                System.out.println("Enter the height (m) of person " + (i + 1) + ":");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] < 0) {
                    System.out.println("Invalid input! Height must be positive.");
                }
            } while (personData[i][1] < 0);

            // Calculate BMI
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nPerson\tWeight(kg)\tHeight(m)\tBMI\t\tStatus");
        for (int i = 0; i < persons; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s%n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

    }
}
