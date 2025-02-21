package control_flow.level_two;

import java.util.Scanner;

public class Youngestfriend {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Taking user input for ages
        System.out.print("Enter Amar's age: ");
        int ageAmar = s.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = s.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = s.nextInt();

        // Taking user input for heights
        System.out.print("Enter Amar's height (in cm): ");
        int heightAmar = s.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int heightAkbar = s.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int heightAnthony = s.nextInt();

        // Finding the youngest friend (smallest age)
        String youngest;
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            youngest = "Amar";
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        // Finding the tallest friend (largest height)
        String tallest;
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            tallest = "Amar";
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

    }
}
