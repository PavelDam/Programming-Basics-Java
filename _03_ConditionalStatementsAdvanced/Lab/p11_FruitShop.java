package L03ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quant = Double.parseDouble(scanner.nextLine());

        boolean workdays = dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday");
        boolean weekend = dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday");

        double price = 0;
        boolean isValidData = true;
        if (workdays) {
            if (fruit.equals("banana")) {
                price = 2.50;
            } else if (fruit.equals("apple")) {
                price = 1.20;
            } else if (fruit.equals("orange")) {
                price = 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = 1.45;
            } else if (fruit.equals("kiwi")) {
                price = 2.70;
            } else if (fruit.equals("pineapple")) {
                price = 5.50;
            } else if (fruit.equals("grapes")) {
                price = 3.85;
            } else {
                isValidData = false;
            }
        } else if (weekend) {
            if (fruit.equals("banana")) {
                price = 2.70;
            } else if (fruit.equals("apple")) {
                price = 1.25;
            } else if (fruit.equals("orange")) {
                price = 0.90;
            } else if (fruit.equals("grapefruit")) {
                price = 1.60;
            } else if (fruit.equals("kiwi")) {
                price = 3.00;
            } else if (fruit.equals("pineapple")) {
                price = 5.60;
            } else if (fruit.equals("grapes")) {
                price = 4.20;
            } else {
                isValidData = false;
            }

        } else {
            isValidData = false;
        }

        if (!isValidData) {
            System.out.println("error");
        } else {
            double totalPrice = quant * price;
            System.out.printf("%.2f",totalPrice);
        }


    }
}
