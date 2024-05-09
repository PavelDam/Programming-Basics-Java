package Exam6And7July2019;

import java.util.Scanner;

public class P01PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());
        double chairTax = Double.parseDouble(scanner.nextLine());
        double umbrelTax = Double.parseDouble(scanner.nextLine());

        double umbrelCount = Math.ceil(1.0 * peopleCount / 2);
        double chairCount = Math.ceil(peopleCount * 0.75);

        double totalSum = peopleCount * tax + chairCount * chairTax + umbrelCount * umbrelTax;
        System.out.printf("%.2f lv.", totalSum);

    }
}
