package L03ConditionalStatementsAdvanced.Bonus;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double pricePerNight = 0;

        if (groupType.equals("boys") || groupType.equals("girls")) {
            switch (season) {
                case "Winter":
                    pricePerNight = 9.60;
                    break;
                case "Spring":
                    pricePerNight = 7.20;
                    break;
                case "Summer":
                    pricePerNight = 15;
                    break;
            }

        } else if (groupType.equals("mixed")) {
            switch (season) {
                case "Winter":
                    pricePerNight = 10;
                    break;
                case "Spring":
                    pricePerNight = 9.50;
                    break;
                case "Summer":
                    pricePerNight = 20;
                    break;
            }
        }
        double totalPrice = students * nights * pricePerNight;

        if (students >= 10 && students < 20) {
            totalPrice = totalPrice * 0.95;
        } else if (students >= 20 && students < 50) {
            totalPrice = totalPrice * 0.85;
        } else if (students >= 50) {
            totalPrice = totalPrice * 0.50;
        }
        String sport = "";

        switch (groupType) {
            case "girls":
                switch (season) {
                    case "Winter":
                        sport = "Gymnastics";
                        break;
                    case "Spring":
                        sport = "Athletics";
                        break;
                    case "Summer":
                        sport = "Volleyball";
                        break;
                }
                break;
            case "boys":
                switch (season) {
                    case "Winter":
                        sport = "Judo";
                        break;
                    case "Spring":
                        sport = "Tennis";
                        break;
                    case "Summer":
                        sport = "Football";
                        break;
                }
                break;
            case "mixed":
                switch (season) {
                    case "Winter":
                        sport = "Ski";
                        break;
                    case "Spring":
                        sport = "Cycling";
                        break;
                    case "Summer":
                        sport = "Swimming";
                        break;
                }
                break;
        }
        System.out.printf("%s %.2f lv.", sport, totalPrice);
    }
}
