package module5;
import java.util.Scanner;

public class MonthlyTemperatures {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] months = {"January","February","March","April","May","June",
                           "July","August","September","October","November","December"};

        double[] temperatures = {30.5,35.2,45.8,55.6,65.1,75.3,
                                 82.4,80.9,71.6,58.4,45.0,32.7};

        System.out.print("Enter a month to view or type 'year' to see all monthly temperatures: ");
        String userChoice = input.nextLine();

        if(userChoice.equalsIgnoreCase("year")) {

            double total = 0;
            double highest = temperatures[0];
            double lowest = temperatures[0];

            System.out.println("\nMonthly Temperatures:");

            for(int i = 0; i < months.length; i++) {

                System.out.println(months[i] + ": " + temperatures[i]);
                total += temperatures[i];

                if(temperatures[i] > highest) {
                    highest = temperatures[i];
                }

                if(temperatures[i] < lowest) {
                    lowest = temperatures[i];
                }
            }

            double average = total / temperatures.length;

            System.out.println("\nYearly Average Temperature: " + average);
            System.out.println("Highest Monthly Average: " + highest);
            System.out.println("Lowest Monthly Average: " + lowest);

        } else {

            boolean found = false;

            for(int i = 0; i < months.length; i++) {

                if(months[i].equalsIgnoreCase(userChoice)) {
                    System.out.println(months[i] + ": " + temperatures[i]);
                    found = true;
                    break;
                }
            }

            if(!found) {
                System.out.println("Invalid month entered.");
            }
        }

        input.close();
    }
}
