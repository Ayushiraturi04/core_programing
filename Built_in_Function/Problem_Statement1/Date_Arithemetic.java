package Problem_Statement1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date_Arithemetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Take date input
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Add 7 days, 1 month, and 2 years
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks
        modifiedDate = modifiedDate.minusWeeks(3);

        // Display the result
        System.out.println("Final date after modifications: " + modifiedDate.format(formatter));
    }
}
