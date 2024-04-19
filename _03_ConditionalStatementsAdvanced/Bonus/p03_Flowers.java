package L03ConditionalStatementsAdvanced.Bonus;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hrisantemsCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int tulipsCount = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String yesOrNo = scanner.nextLine();
        double hrisantemPrice = 0;
        double rosePrice = 0;
        double tulipPrice = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                hrisantemPrice = 2;
                rosePrice = 4.10;
                tulipPrice = 2.50;
                break;
            case "Autumn":
            case "Winter":
                hrisantemPrice = 3.75;
                rosePrice = 4.50;
                tulipPrice = 4.15;
                break;
        }
        double totalPrice = hrisantemsCount * hrisantemPrice + rosesCount * rosePrice + tulipsCount * tulipPrice;
        if (yesOrNo.equals("Y")) {
            totalPrice = totalPrice * 1.15;
        }
        if (tulipsCount > 7 && season.equals("Spring")) {
            totalPrice = totalPrice * 0.95;
        }
        if (rosesCount >= 10 && season.equals("Winter")) {
            totalPrice = totalPrice * 0.90;
        }
        if (hrisantemsCount + rosesCount + tulipsCount > 20) {
            totalPrice = totalPrice * 0.80;
        }
        System.out.printf("%.2f", totalPrice + 2);
    }
}
