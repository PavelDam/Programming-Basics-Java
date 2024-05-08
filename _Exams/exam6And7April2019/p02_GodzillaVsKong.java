package Exam6And7April2019;

import java.util.Scanner;

public class P02GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int stats = Integer.parseInt(scanner.nextLine());
        double clothPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.10;
        if (stats > 150) {
            clothPrice = clothPrice * 0.9;
        }
        double totalSum = stats * clothPrice + decorPrice;
        if (budget >= totalSum) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalSum);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalSum - budget);
        }

    }
}
