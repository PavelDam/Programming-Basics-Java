package Exam15And16June2019;

import java.util.Scanner;

public class P05Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int serials = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        for (int i = 1; i <= serials; i++) {
            String name = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());
            switch (name) {
                case "Thrones":
                    price = price * 0.50;
                    break;
                case "Lucifer":
                    price = price * 0.60;
                    break;
                case "Protector":
                    price = price * 0.70;
                    break;
                case "TotalDrama":
                    price = price * 0.80;
                    break;
                case "Area":
                    price = price * 0.90;
                    break;
            }
            totalPrice += price;
        }
        if (budget >= totalPrice) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - totalPrice);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", totalPrice - budget);
        }
    }
}
