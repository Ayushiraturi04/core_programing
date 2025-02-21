package Level_one;

public class Division {
    public static void main(String[] args) {
        int totalpens = 14;
        int totalstudents = 3;

        // Find the pens per student
        int pens_to_student = totalpens / totalstudents;

        // Find the remaining student
        int remaining_student = totalpens % totalstudents;
        System.out.println("The Pen Per Student is :" + pens_to_student + " and the remaining pen not distributed is :"
                + remaining_student);

    }
}
