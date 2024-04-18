package L03ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String type = "";
        double totalSum = 0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                type = "Camp";
                totalSum = budget * 0.3;
            } else if (season.equals("winter")) {
                type = "Hotel";
                totalSum = budget * 0.7;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                type = "Camp";
                totalSum = budget * 0.40;
            } else if (season.equals("winter")) {
                type = "Hotel";
                totalSum = budget * 0.80;
            }
        } else {
            destination = "Europe";
            type = "Hotel";
            totalSum = budget * 0.90;
        }
        System.out.printf("Somewhere in %s%n%s - %.2f", destination, type, totalSum);

    }
}

