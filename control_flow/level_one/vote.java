package control_flow.level_one;

import java.util.*;;

public class vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the person's age: ");
        int age = scanner.nextInt();

        // Checking voting eligibility
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

    }
}
