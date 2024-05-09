package Exam6And7July2019;

import java.util.Scanner;

public class P04Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double totalSum = 0;
        double cocktailSum = 0;

        while (!input.equals("Party!")) {
            int lenghtText = input.length();
            int cocktailsCount = Integer.parseInt(scanner.nextLine());
            ;
            cocktailSum = lenghtText * cocktailsCount;

            if (cocktailSum % 2 != 0) {
                cocktailSum = cocktailSum * 0.75;
            }
            totalSum += cocktailSum;

            if (totalSum >= income) {
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("Party!")) {
            System.out.printf("We need %.2f leva more.%n", income - totalSum);
            System.out.printf("Club income - %.2f leva.", totalSum);
        }
        if (totalSum >= income) {
            System.out.println("Target acquired.");
            System.out.printf("Club income - %.2f leva.", totalSum);
        }

    }
}
