package control_flow.level_three;

import java.util.Scanner;

public class calculategrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input for Three subjects
        System.out.println("Enter the marks of Physics: ");
        float physics = sc.nextFloat();
        System.out.println("Enter the marks of Chemistry: ");
        float chemistry = sc.nextFloat();
        System.out.println("Enter the marks of Maths: ");
        float maths = sc.nextFloat();

        // Find the average of Three Subjects
        float percentage = (physics + chemistry + maths) / 3;
        System.out.println("The percentage is: " + percentage);

        // Checking the conditions
        if (percentage >= 40) {
            if (percentage >= 70) {
                System.out.println("The grade is A");
            } else if (percentage >= 60) {
                System.out.println("The grade is B");
            } else if (percentage >= 50) {
                System.out.println("The grade is C");
            } else {
                System.out.println("The grade is D");
            }
        } else {
            System.out.println("The grade is F");
        }
    }
}