import java.util.Scanner;

class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int totalMarks = 0;

        // Taking marks input
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = sc.nextInt();

            // validation
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Enter between 0 and 100.");
                i--; // re-enter the same subject
                continue;
            }

            totalMarks += marks;
        }

        // Calculate average percentage
        double average = (double) totalMarks / n;

        // Grade calculation
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("\n--- RESULT ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
