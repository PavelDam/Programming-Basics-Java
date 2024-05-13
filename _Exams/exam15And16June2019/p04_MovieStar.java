package Exam15And16June2019;

import java.util.Scanner;

public class P04MovieStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("ACTION")) {
            int lenghtText = input.length();
            if (lenghtText > 15) {
                budget -= budget * 0.20;
                input = scanner.nextLine();
                continue;
            }
            double salary = Double.parseDouble(scanner.nextLine());;
            budget -= salary;
            if (budget < 0) {
                break;
            }
            input = scanner.nextLine();
        }
        if (budget >= 0) {
            System.out.printf("We are left with %.2f leva.", budget);
        } else {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        }
    }
}
