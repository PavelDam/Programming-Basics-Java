package Exam6And7July2019;

import java.util.Scanner;

public class P03TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String townName = scanner.nextLine();
        String packegeType = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        boolean isValidData = true;

        double pricePerDay = 0;


        if (days < 1) {
            System.out.println("Days must be positive number!");
            return;
        }

        if (townName.equals("Bansko") || townName.equals("Borovets")) {
            if ("withEquipment".equals(packegeType)) {
                pricePerDay = 100;
                if (vip.equals("yes")) {
                    pricePerDay = pricePerDay * 0.90;
                }
            } else if ("noEquipment".equals(packegeType)) {
                pricePerDay = 80;
                if (vip.equals("yes")) {
                    pricePerDay = pricePerDay * 0.95;
                }
            } else {
                isValidData = false;
            }

        } else if (townName.equals("Varna") || townName.equals("Burgas")) {
            if ("withBreakfast".equals(packegeType)) {
                pricePerDay = 130;
                if (vip.equals("yes")) {
                    pricePerDay = pricePerDay * 0.88;
                }
            } else if ("noBreakfast".equals(packegeType)) {
                pricePerDay = 100;
                if (vip.equals("yes")) {
                    pricePerDay = pricePerDay * 0.93;
                }
            } else {
                isValidData = false;
            }
        } else {
            isValidData = false;
        }
        if (days > 7) {
            days = days - 1;
        }
        double totalSum = days * pricePerDay;

        if (!isValidData) {
            System.out.println("Invalid input!");
        } else {
            System.out.printf("The price is %.2flv! Have a nice time!", totalSum);
        }

    }
}
