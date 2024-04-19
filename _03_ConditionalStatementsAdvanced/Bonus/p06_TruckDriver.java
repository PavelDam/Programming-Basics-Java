package L03ConditionalStatementsAdvanced.Bonus;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());
        double pricePerKm = 0;
        switch (season) {
            case "Spring":
            case "Autumn":
                if (km <= 5000) {
                    pricePerKm = 0.75;
                } else if (km <= 10000) {
                    pricePerKm = 0.95;
                } else {
                    pricePerKm = 1.45;
                }
                break;
            case "Summer":
                if (km <= 5000) {
                    pricePerKm = 0.90;
                } else if (km <= 10000) {
                    pricePerKm = 1.10;
                } else {
                    pricePerKm = 1.45;
                }
                break;
            case "Winter":
                if (km <= 5000) {
                    pricePerKm = 1.05;
                } else if (km <= 10000) {
                    pricePerKm = 1.25;
                } else {
                    pricePerKm = 1.45;
                }
                break;
        }
        double salary = 4 * (km * pricePerKm) * 0.90;
        System.out.printf("%.2f",salary);
    }
}
