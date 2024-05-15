package Exam20and21April2019;

import java.util.Scanner;

public class P06EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int customerCount = Integer.parseInt(scanner.nextLine());

        double totalSpending = 0;

        for (int i = 1; i <= customerCount; i++) {
            String input = scanner.nextLine();
            int purchaseCount = 0;
            double totalPrice = 0;
            while (!input.equals("Finish")) {
                purchaseCount++;
                double price = 0;

                switch (input) {
                    case "basket":
                        price = 1.50;
                        break;
                    case "wreath":
                        price = 3.80;
                        break;
                    case "chocolate bunny":
                        price = 7;
                        break;
                }
                totalPrice += price;

                input = scanner.nextLine();
            }
            if (purchaseCount % 2 == 0) {
                totalPrice = totalPrice * 0.80;
            }
            totalSpending += totalPrice;
            System.out.printf("You purchased %d items for %.2f leva.%n", purchaseCount, totalPrice);
        }
        System.out.printf("Average bill per client is: %.2f leva.", (totalSpending / customerCount));
    }
}
