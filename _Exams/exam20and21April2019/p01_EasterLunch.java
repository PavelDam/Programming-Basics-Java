package Exam20and21April2019;

import java.util.Scanner;

public class P01EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Козунак  – 3.20 лв.
        //•	Яйца –  4.35 лв. за кора с 12 яйца
        //•	Курабии – 5.40 лв. за килограм
        //•	Боя за яйца - 0.15 лв. за яйце

        int breedCount = Integer.parseInt(scanner.nextLine());
        int eggsSetCount = Integer.parseInt(scanner.nextLine());
        int cookiesKg = Integer.parseInt(scanner.nextLine());
        int totalEggs = eggsSetCount * 12;
        double eggsPaint = totalEggs * 0.15;

        double totalPrice = (3.20 * breedCount) + (cookiesKg * 5.40) + (eggsSetCount * 4.35 + eggsPaint);
        System.out.printf("%.2f", totalPrice);
    }
}
