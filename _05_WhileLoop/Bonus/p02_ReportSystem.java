package L05WhileLoop.Bonus;

import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int expSum = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int transCounter = 0;
        int totalMoney = 0;
        int cS = 0;
        int cSCounter = 0;
        int cC = 0;
        int cCCounter = 0;

        while (!input.equals("End")) {
            int price = Integer.parseInt(input);
            transCounter++;
            if (transCounter % 2 == 0) {
                if (price < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    cC += price;
                    cCCounter++;
                    totalMoney += price;
                }
            } else {
                if (price > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    cS += price;
                    cSCounter++;
                    totalMoney += price;
                }
            }
            if (totalMoney >= expSum) {
                break;
            }
            input = scanner.nextLine();
        }
        if (totalMoney >= expSum) {
            System.out.printf("Average CS: %.2f%n", (1.0 * cS / cSCounter));
            System.out.printf("Average CC: %.2f%n", (1.0 * cC / cCCounter));
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
