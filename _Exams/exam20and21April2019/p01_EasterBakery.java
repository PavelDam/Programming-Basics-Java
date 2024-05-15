package Exam20and21April2019;

import java.util.Scanner;

public class P01EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double flourPriceKg = Double.parseDouble(scanner.nextLine());
        double flourKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int eggsSetCount = Integer.parseInt(scanner.nextLine());
        int eastSets = Integer.parseInt(scanner.nextLine());

        double sugarPriceKg = flourPriceKg * 0.75;
        double eggsSetPrice = flourPriceKg * 1.10;
        double eastPrice = sugarPriceKg * 0.20;

        double totalPrice = (flourPriceKg * flourKg) + (sugarPriceKg * sugarKg) + (eggsSetPrice * eggsSetCount) + (eastPrice * eastSets);

        System.out.printf("%.2f", totalPrice);
    }
}
