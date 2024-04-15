package L02ConditionalStatements.Exercises;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int barbieCount = Integer.parseInt(scanner.nextLine());
        int bearCount = Integer.parseInt(scanner.nextLine());
        int minionCount = Integer.parseInt(scanner.nextLine());
        int truckCount = Integer.parseInt(scanner.nextLine());

        //double puzzlePrice = 2.60;
        //double barbiePrice = 3;
        //double bearPrice = 4.10;
        //double minionPrice = 8.20;
        //double truckPrice = 2;

        double totalSum = 2.60 * puzzleCount + 3 * barbieCount + 4.10 * bearCount + 8.20 * minionCount + 2 * truckCount;
        int totalCount = puzzleCount + bearCount + bearCount + minionCount + truckCount;

        if (totalCount >= 50) {
            totalSum = totalSum * 0.75;
        }
        totalSum = totalSum * 0.90;

        if (vacationPrice <= totalSum) {
            System.out.printf("Yes! %.2f lv left.", totalSum - vacationPrice);

        } else {
            System.out.printf("Not enough money! %.2f lv needed.", vacationPrice - totalSum);
        }
    }
}