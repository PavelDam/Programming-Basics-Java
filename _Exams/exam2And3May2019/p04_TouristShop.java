package Exam2And3May2019;

import java.util.Scanner;

public class P04TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        int itemCounter = 0;
        double totalSum = 0;

        while (!input.equals("Stop")) {
            itemCounter++;
            double itemPrice = Double.parseDouble(scanner.nextLine());
            if (itemCounter % 3 == 0) {
                itemPrice = itemPrice / 2;
            }

            totalSum += itemPrice;

            if (totalSum > budget) {

                break;
            }
            input = scanner.nextLine();
        }
        if (totalSum > budget) {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", (totalSum - budget));
        } else {
            System.out.printf("You bought %d products for %.2f leva.", itemCounter, totalSum);
        }
    }
}
