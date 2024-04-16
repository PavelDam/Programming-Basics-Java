package L02ConditionalStatements.Bonus;

import java.util.Scanner;

public class P07FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double litersInTank = Double.parseDouble(scanner.nextLine());

        if (fuelType.equals("Diesel") || fuelType.equals("Gasoline") || fuelType.equals("Gas")) {
            if (litersInTank >= 25) {
                System.out.printf("You have enough %s.",fuelType.toLowerCase());

            } else {
                System.out.printf("Fill your tank with %s!",fuelType.toLowerCase());
            }

        } else {
            System.out.println("Invalid fuel!");
        }

    }
}
