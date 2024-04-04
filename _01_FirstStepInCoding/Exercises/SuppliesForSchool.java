package L01FirstStepInCoding.Exercises;

import java.util.Scanner;

public class SuppliesForSchool {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // пакет химикали - 5.80 лв
        // пакет маркери - 7.20 лв
        // препарат - 1.20 лв (за литър)

        int penPack = Integer.parseInt(scanner.nextLine());
        int markPack = Integer.parseInt(scanner.nextLine());
        int liters = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine()) / 100;

        double penPrice = penPack * 5.80;
        double markPrice = markPack * 7.20;
        double litersPrice = liters * 1.20;

        double totalSum = penPrice + markPrice + litersPrice;
        double totalDiscount = totalSum * discount;
        double total = totalSum - totalDiscount;

        System.out.println(total);

    }
}
