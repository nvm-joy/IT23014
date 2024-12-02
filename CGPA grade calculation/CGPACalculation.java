import java.util.Scanner;

public class CGPACalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentID = sc.nextLine();

        System.out.print("Enter Number of Courses: ");
        int num_courses = sc.nextInt();

        int total_credits = 0;
        double total_points = 0;

        for (int i=1; i<=num_courses; i++) {
            System.out.println("Course " + i + ":");

            System.out.print("  Credit (Max 3): ");
            int credit = sc.nextInt();

            System.out.print("  CT (Max 30): ");
            int ct = sc.nextInt();

            System.out.print("  AT (Max 10): ");
            int at = sc.nextInt();

            System.out.print("  FE (Max 60): ");
            int fe = sc.nextInt();

            int total_score = ct + at + fe;

            double grade_point;
            if (total_score >= 80) {
                grade_point = 4.0;
            } else if (total_score >= 75 || total_score <= 79) {
                grade_point = 3.75;
            } else if (total_score >= 70 || total_score <= 74) {
                grade_point = 3.5;
            } else if (total_score >= 65 || total_score <= 69) {
                grade_point = 3.25;
            } else if (total_score >= 60 || total_score <= 64) {
                grade_point = 3.00;
            } else if (total_score >= 55 || total_score <= 59) {
                grade_point = 2.75;
            } else if (total_score >= 50 || total_score <= 54) {
                grade_point = 2.5;
            } else if (total_score >= 45 || total_score <= 49) {
                grade_point = 2.25;
            } else if (total_score >= 40 || total_score <= 44) {
                grade_point = 2.00;
            } else {
                grade_point = 0.0;
            
            }

            total_credits += credit;
            total_points += grade_point * credit;
        }

        double cgpa = total_points / total_credits;

        String grade;
        if (cgpa >= 4) {
            grade = "A+";
        } else if (cgpa >= 3.75) {
            grade = "A";
        } else if (cgpa >= 3.5) {
            grade = "A-";
        } else if (cgpa >= 3.25) {
            grade = "B+";
        } else if (cgpa >= 3.00) {
            grade = "B";
        } else if (cgpa >= 2.75) {
            grade = "B-";
        } else if (cgpa >= 2.5) {
            grade = "C+";
        } else if (cgpa >= 2.25) {
            grade = "C";
        } else if (cgpa >= 2.00) {
            grade = "C-";
        } else {
            grade = "F";
        }

        System.out.println("\nStudent ID: " + studentID);
        System.out.println("Credit Taken: " + total_credits);
        System.out.println("Credit Earned: " + total_credits);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
