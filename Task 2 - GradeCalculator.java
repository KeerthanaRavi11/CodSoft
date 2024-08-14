
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input marks for each subject
        System.out.println("Enter number of subjects: ");
        int size = sc.nextInt();

        int[] marks = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();
        }

        // Calculate total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / size;

        // Assign grade based on average percentage
        String grade;
        if (averagePercentage >= 90) {
            grade = " Grade A";
        } else if (averagePercentage >= 80) {
            grade = " Grade B";
        } else if (averagePercentage >= 70) {
            grade = "Grade C";
        } else if (averagePercentage >= 60) {
            grade = "Grade D";
        } else {
            grade = "Grade F";
        }

        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);
    }
}
