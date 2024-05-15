package Exam20and21April2019;

import java.util.Scanner;

public class P02EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guestsCount = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        if (guestsCount >= 10 && guestsCount <= 15) {
            ticketPrice = ticketPrice * 0.85;
        } else if (guestsCount > 10 && guestsCount <= 20) {
            ticketPrice = ticketPrice * 0.80;
        } else if (guestsCount > 20) {
            ticketPrice = ticketPrice * 0.75;
        }
        double cakePrice = budget * 0.10;
        double totalSum = guestsCount * ticketPrice + cakePrice;

        if (budget >= totalSum) {
            System.out.printf("It is party time! %.2f leva left.", (budget - totalSum));
        } else {
            System.out.printf("No party! %.2f leva needed.", (totalSum - budget));
        }
    }
}
