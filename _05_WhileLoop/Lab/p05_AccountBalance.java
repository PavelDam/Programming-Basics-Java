package L05WhileLoop.Lab;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double totalSum = 0;
        while (!input.equals("NoMoreMoney")) {
            double sum = Double.parseDouble(input);

            if (sum < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            totalSum = totalSum + sum;
            input = scanner.nextLine();
            System.out.printf("Increase: %.2f%n", sum);
        }
        System.out.printf("Total: %.2f", totalSum);
    }
}
