import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSubjects = 5;
        int[] marks = new int[numberOfSubjects];
        int totalMarks = 0;

        System.out.println("Enter the marks obtained in each subject (out of 100):");
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                i--;
            } else {
                totalMarks += marks[i];
            }
        }

        System.out.println("\nTotal Marks Obtained: " + totalMarks);

        double averagePercentage = (double) totalMarks / numberOfSubjects;
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
