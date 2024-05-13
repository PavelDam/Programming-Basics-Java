package Exam15And16June2019;

import java.util.Scanner;

public class P03MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        int pricePerDay = 0;
        if (season.equals("Winter")) {
            switch (destination) {
                case "Dubai":
                    pricePerDay = 45000;
                    break;
                case "Sofia":
                    pricePerDay = 17000;
                    break;
                case "London":
                    pricePerDay = 24000;
                    break;
            }
        } else if (season.equals("Summer")) {
            switch (destination) {
                case "Dubai":
                    pricePerDay = 40000;
                    break;
                case "Sofia":
                    pricePerDay = 12500;
                    break;
                case "London":
                    pricePerDay = 20250;
                    break;
            }
        }
        double totalPrice = pricePerDay * days;
        if (destination.equals("Dubai")) {
            totalPrice = totalPrice * 0.70;
        }
        if (destination.equals("Sofia")) {
            totalPrice = totalPrice * 1.25;
        }
        if (budget >= totalPrice) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", (budget - totalPrice));
        } else {
            System.out.printf("The director needs %.2f leva more!", (totalPrice - budget));
        }
    }
}
