package L01FirstStepInCoding.Bonus;

import java.util.Scanner;

public class VegetableMarket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1 eur = 1.94lv

        double vegPriceKg = Double.parseDouble(scanner.nextLine());
        double fruitPriceKg = Double.parseDouble(scanner.nextLine());
        double totalKgVeg = Double.parseDouble(scanner.nextLine());
        double totalKgFruit = Double.parseDouble(scanner.nextLine());

        // totalEarnings
        double totalSumVeg = vegPriceKg * totalKgVeg;
        double totalSumFruit = fruitPriceKg * totalKgFruit;

        double totalSum = (totalSumFruit + totalSumVeg) / 1.94;

        System.out.printf("%.2f",totalSum);
    }
}
