import java.util.Scanner;

public class student{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();

        int[] marksObtained = new int[numSubjects];

        System.out.println("Enter marks obtained in each subject:");

        
        for (int i = 0; i < numSubjects; i++) {
            System.out.printf("Subject %d: ", i + 1);
            marksObtained[i] = scanner.nextInt();
        }

       
        int totalMarks = 0;
        for (int marks : marksObtained) {
            totalMarks += marks;
        }

        
        double averagePercentage = (double) totalMarks / numSubjects;

        
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

        
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        
        scanner.close();
    }
}
