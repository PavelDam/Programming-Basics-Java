package Exam2And3May2019;

import java.util.Scanner;

public class P06VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double total = 0;
        for (int i = 1; i <= days; i++) {
            double totalPrice = 0;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    totalPrice += 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    totalPrice += 1.25;
                } else {
                    totalPrice += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n",i,totalPrice);
            total += totalPrice;
        }
        System.out.printf("Total: %.2f leva",total);
    }
}
