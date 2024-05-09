package Exam6And7July2019;

import java.util.Scanner;

public class P03CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String sugar = scanner.nextLine();
        int countDrinks = Integer.parseInt(scanner.nextLine());

        double pricePerDrink = 0;

        if (type.equals("Espresso")) {
            switch (sugar) {
                case "Without":
                    pricePerDrink = 0.90;
                    break;
                case "Normal":
                    pricePerDrink = 1;
                    break;
                case "Extra":
                    pricePerDrink = 1.20;
                    break;
            }
        } else if (type.equals("Cappuccino")) {
            switch (sugar) {
                case "Without":
                    pricePerDrink = 1;
                    break;
                case "Normal":
                    pricePerDrink = 1.20;
                    break;
                case "Extra":
                    pricePerDrink = 1.60;
                    break;
            }
        } else if (type.equals("Tea")) {
            switch (sugar) {
                case "Without":
                    pricePerDrink = 0.50;
                    break;
                case "Normal":
                    pricePerDrink = 0.60;
                    break;
                case "Extra":
                    pricePerDrink = 0.70;
                    break;
            }
        }
        if (sugar.equals("Without")) {
            pricePerDrink = pricePerDrink * 0.65;
        }
        if (type.equals("Espresso") && countDrinks >= 5) {
            pricePerDrink = pricePerDrink * 0.75;
        }

        double totalSum = countDrinks * pricePerDrink;

        if (totalSum > 15) {
            totalSum = totalSum * 0.80;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", countDrinks, type, totalSum);
    }
}
