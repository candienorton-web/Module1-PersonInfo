package Module4;

import java.util.Scanner;

public class GradeStatistics {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double grade;
        double total = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double average;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Enter grade #" + i + ": ");
            grade = input.nextDouble();

            total += grade;

            if (grade > max) {
                max = grade;
            }

            if (grade < min) {
                min = grade;
            }
        }

        average = total / 10;

        System.out.println("\nGrade Statistics");
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        input.close();
    }
}
