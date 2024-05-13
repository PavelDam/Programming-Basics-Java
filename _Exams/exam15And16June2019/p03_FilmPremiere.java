package Exam15And16June2019;

import java.util.Scanner;

public class P03FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String pack = scanner.nextLine();
        int ticketsCount = Integer.parseInt(scanner.nextLine());

        int price = 0;
        if ("John Wick".equals(name)) {
            switch (pack) {
                case "Drink":
                    price = 12;
                    break;
                case "Popcorn":
                    price = 15;
                    break;
                case "Menu":
                    price = 19;
                    break;
            }

        } else if ("Star Wars".equals(name)) {
            switch (pack) {
                case "Drink":
                    price = 18;
                    break;
                case "Popcorn":
                    price = 25;
                    break;
                case "Menu":
                    price = 30;
                    break;
            }
        } else if ("Jumanji".equals(name)) {
            switch (pack) {
                case "Drink":
                    price = 9;
                    break;
                case "Popcorn":
                    price = 11;
                    break;
                case "Menu":
                    price = 14;
                    break;
            }
        }
        double totalPrice = ticketsCount * price;
        if (name.equals("Star Wars") && ticketsCount >= 4) {
            totalPrice *= 0.70;
        }
        if (name.equals("Jumanji") && ticketsCount == 2) {
            totalPrice *= 0.85;
        }

        System.out.printf("Your bill is %.2f leva.", totalPrice);
    }
}
