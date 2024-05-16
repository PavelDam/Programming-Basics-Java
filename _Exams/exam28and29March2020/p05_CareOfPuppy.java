package Exam28and29March2020;

import java.util.Scanner;

public class P05CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodKg = Integer.parseInt(scanner.nextLine());

        int foodGr = foodKg * 1000;
        int foodLeft = foodGr;

        String input = scanner.nextLine();

        while (!input.equals("Adopted")) {
            int food = Integer.parseInt(input);

            foodLeft -= food;

            input = scanner.nextLine();
        }
        if (foodLeft >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodLeft);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(foodLeft));
        }
    }
}
