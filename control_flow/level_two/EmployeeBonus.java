package control_flow.level_two;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for salary and years of service
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        double bonus = 0;

        // Checking if the employee is eligible for a bonus
        if (yearsOfService > 5) {
            bonus = 0.05 * salary; // 5% bonus
        }

        // Printing the bonus amount
        System.out.println("Bonus Amount: " + bonus);

    }
}
