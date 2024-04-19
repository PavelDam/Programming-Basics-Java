package L03ConditionalStatementsAdvanced.Bonus;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double transportExpenses = 0;
        double ticketPrice = 0;

        switch (category) {
            case "VIP":
                ticketPrice = 499.99;
                break;
            case "Normal":
                ticketPrice = 249.99;
                break;
        }
        if (people <= 4) {
            transportExpenses = budget * 0.75;
        } else if (people <= 9) {
            transportExpenses = budget * 0.60;
        } else if (people <= 24) {
            transportExpenses = budget * 0.50;
        } else if (people <= 49) {
            transportExpenses = budget * 0.40;
        } else if (people > 50) {
            transportExpenses = budget * 0.25;
        }
        double moneyLeft = budget - transportExpenses;
        double totalTicketPrice = ticketPrice * people;
        if (moneyLeft >= totalTicketPrice) {
            System.out.printf("Yes! You have %.2f leva left.", (moneyLeft - totalTicketPrice));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", (totalTicketPrice - moneyLeft));
        }
    }
}
