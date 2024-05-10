package Exam9And10March2019;

import java.util.Scanner;

public class P03WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int ticketCount = Integer.parseInt(scanner.nextLine());
        String picture = scanner.nextLine();

        double ticketPrice = 0;
        double withPicture = 0;

        if (stage.equals("Quarter final")) {
            switch (ticketType) {
                case "Standard":
                    ticketPrice = 55.50;
                    break;
                case "Premium":
                    ticketPrice = 105.20;
                    break;
                case "VIP":
                    ticketPrice = 118.90;
                    break;
            }
        } else if (stage.equals("Semi final")) {
            switch (ticketType) {
                case "Standard":
                    ticketPrice = 75.88;
                    break;
                case "Premium":
                    ticketPrice = 125.22;
                    break;
                case "VIP":
                    ticketPrice = 300.40;
                    break;
            }
        } else if (stage.equals("Final")) {
            switch (ticketType) {
                case "Standard":
                    ticketPrice = 110.10;
                    break;
                case "Premium":
                    ticketPrice = 160.66;
                    break;
                case "VIP":
                    ticketPrice = 400;
                    break;
            }
        }
        double totalPrice = ticketPrice * ticketCount;

        if (totalPrice > 2500 && totalPrice <=4000) {
            totalPrice = totalPrice * 0.90;
        }

        if (picture.equals("Y")) {
            withPicture = ticketCount * 40;
            totalPrice += withPicture;
        }

        if (totalPrice > 4000) {
            totalPrice = totalPrice - withPicture;
            totalPrice = totalPrice * 0.75;
        }

        System.out.printf("%.2f", totalPrice);
    }
}
