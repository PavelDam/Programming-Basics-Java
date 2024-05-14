package Exam18and19July2020;

import java.util.Scanner;

public class P02AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double luggadgePrice = Double.parseDouble(scanner.nextLine());
        double luggadgeWeight = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int luggadgeCount = Integer.parseInt(scanner.nextLine());

        if (luggadgeWeight < 10) {
            luggadgePrice = luggadgePrice * 0.20;
        } else if (luggadgeWeight >= 10 && luggadgeWeight <= 20) {
            luggadgePrice = luggadgePrice * 0.50;
        }
        if (days > 30) {
            luggadgePrice = luggadgePrice * 1.10;
        } else if (days >= 7 && days <= 30) {
            luggadgePrice = luggadgePrice * 1.15;
        } else {
            luggadgePrice = luggadgePrice * 1.40;
        }
        double totalPrice = luggadgePrice * luggadgeCount;
        System.out.printf("The total price of bags is: %.2f lv.", totalPrice);
    }
}
