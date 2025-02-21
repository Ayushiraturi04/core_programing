package level_two;

import java.util.Scanner;

public class mathpow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object to take input from user

        // Taking user input for coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        // Calling the method to find the roots of the quadratic equation
        double[] roots = findRoots(a, b, c);

        // Displaying the results based on the number of roots found
        if (roots.length == 2) {
            System.out.println("Roots of the quadratic equation are: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("Root of the quadratic equation is: " + roots[0]);
        } else {
            System.out.println("No real roots exist.");
        }

    }
    // delta = b2+ 4*a*c

    public static double[] findRoots(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Not a quadratic equation. 'a' must not be zero.");
            return new double[0]; // Return empty array if a is 0
        }

        // Calculating delta (discriminant)
        double delta = Math.pow(b, 2) - (4 * a * c);

        // If delta is positive, return two real roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] { root1, root2 };
        }
        // If delta is zero, return one real root
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] { root };
        }
        // If delta is negative, no real roots exist
        else {
            return new double[0];
        }
    }
}
