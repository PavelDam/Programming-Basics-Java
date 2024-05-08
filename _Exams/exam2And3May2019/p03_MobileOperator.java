package Exam2And3May2019;

import java.util.Scanner;

public class P03MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String term = scanner.nextLine();
        String type = scanner.nextLine();
        String internet = scanner.nextLine();
        int month = Integer.parseInt(scanner.nextLine());

        //•	при добавен мобилен интернет, към таксата за един месец се добавя:
        //o	при такса по-малка или равна на 10.00 лв.  5.50 лв.
        //o	при такса по-малка или равна на 30.00 лв.  4.35 лв.
        //o	при такса по-голяма от 30.00 лв.  3.85 лв.
        //•	ако договорът e за две години, общата сума се намалява с 3.75%
        double pricePerMonth = 0;

        if (term.equals("one")) {
            switch (type) {
                case "Small":
                    pricePerMonth = 9.98;
                    break;
                case "Middle":
                    pricePerMonth = 18.99;
                    break;
                case "Large":
                    pricePerMonth = 25.98;
                    break;
                case "ExtraLarge":
                    pricePerMonth = 35.99;
                    break;
            }
        } else if (term.equals("two")) {
            switch (type) {
                case "Small":
                    pricePerMonth = 8.58;
                    break;
                case "Middle":
                    pricePerMonth = 17.09;
                    break;
                case "Large":
                    pricePerMonth = 23.59;
                    break;
                case "ExtraLarge":
                    pricePerMonth = 31.79;
                    break;
            }
        }
        if (pricePerMonth <= 10 && internet.equals("yes")) {
            pricePerMonth += 5.50;
        } else if (pricePerMonth <= 30 && internet.equals("yes")) {
            pricePerMonth += 4.35;
        } else if (pricePerMonth > 30 && internet.equals("yes")) {
            pricePerMonth += 3.85;
        }
        if (term.equals("two")) {
            pricePerMonth = pricePerMonth * 0.9625;
        }
        double totalSum = pricePerMonth * month;

        System.out.printf("%.2f lv.", totalSum);

    }
}
