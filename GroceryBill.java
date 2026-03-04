package module4;

import java.util.Scanner;

public class GroceryBill {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        // Ask user for coupon
        System.out.print("Enter coupon amount as a decimal (example 0.10): ");
        double coupon = scnr.nextDouble();

        // Validate coupon
        if (coupon > 1.0 || coupon <= 0.0) {
            coupon = 0.10;
            System.out.println("Invalid coupon entered. Coupon set to 10%");
        }

        // Get grocery bills for 4 weeks
        System.out.print("Enter Week 1 grocery bill: ");
        double week1 = scnr.nextDouble();

        System.out.print("Enter Week 2 grocery bill: ");
        double week2 = scnr.nextDouble();

        System.out.print("Enter Week 3 grocery bill: ");
        double week3 = scnr.nextDouble();

        System.out.print("Enter Week 4 grocery bill: ");
        double week4 = scnr.nextDouble();

        // Calculate totals
        double monthlyTotal = week1 + week2 + week3 + week4;
        double weeklyAverage = monthlyTotal / 4;

        // Apply coupon
        double monthlyWithCoupon = monthlyTotal * (1 - coupon);
        double weeklyWithCoupon = monthlyWithCoupon / 4;

        // Display results
        System.out.println("\nGrocery Bill Summary");

        System.out.println("Monthly total without coupon: $" + monthlyTotal);
        System.out.println("Weekly average without coupon: $" + weeklyAverage);

        System.out.println("Monthly total with coupon: $" + monthlyWithCoupon);
        System.out.println("Weekly average with coupon: $" + weeklyWithCoupon);

        scnr.close();
    }
}

