package L05WhileLoop.Bonus;

import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottlesSoup = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int totalMl = bottlesSoup * 750;
        int count = 0;
        int mlNeeded = 0;
        int totalNeededMl = 0;
        int dish = 0;
        int pots = 0;

        while (!input.equals("End")) {
            int dishes = Integer.parseInt(input);
            count++;
            if (count % 3 == 0) {
                mlNeeded = dishes * 15;
                totalNeededMl += mlNeeded;
                pots += dishes;
            } else {
                mlNeeded = dishes * 5;
                totalNeededMl += mlNeeded;
                dish += dishes;
            }
            if (totalNeededMl > totalMl) {
                break;
            }

            input = scanner.nextLine();
        }
        if (totalMl < totalNeededMl) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", (totalNeededMl - totalMl));
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", dish, pots);
            System.out.printf("Leftover detergent %d ml.", totalMl - totalNeededMl);
        }
    }
}
