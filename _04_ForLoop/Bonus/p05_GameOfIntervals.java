package L04ForLoop.Bonus;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moves = Integer.parseInt(scanner.nextLine());

        double points = 0;
        int btw0And9 = 0;
        int btw10And19 = 0;
        int btw20And29 = 0;
        int btw30And39 = 0;
        int btw40And50 = 0;
        int unknown = 0;

        for (int i = 1; i <= moves; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num >= 0 && num <= 9) {
                btw0And9 += 1;
                points += num * 0.2;
            } else if (num >= 10 && num <= 19) {
                btw10And19 += 1;
                points += num * 0.3;
            } else if (num >= 20 && num <= 29) {
                btw20And29 += 1;
                points += num * 0.4;
            } else if (num >= 30 && num <= 39) {
                btw30And39 += 1;
                points += 50;
            } else if (num >= 40 && num <= 50) {
                btw40And50 += 1;
                points += 100;
            }
            if (num < 0 || num > 50) {
                unknown += 1;
                points /= 2;
            }
        }
        double pBtw0And9 = 1.0 * btw0And9 / moves * 100;
        double pBtw10And19 = 1.0 * btw10And19 / moves * 100;
        double pBtw20And29 = 1.0 * btw20And29 / moves * 100;
        double pBtw30And39 = 1.0 * btw30And39 / moves * 100;
        double pBtw40And50 = 1.0 * btw40And50 / moves * 100;
        double pUnknown = 1.0 * unknown / moves * 100;

        System.out.printf("%.2f%n", points);
        System.out.printf("From 0 to 9: %.2f%%%n", pBtw0And9);
        System.out.printf("From 10 to 19: %.2f%%%n", pBtw10And19);
        System.out.printf("From 20 to 29: %.2f%%%n", pBtw20And29);
        System.out.printf("From 30 to 39: %.2f%%%n", pBtw30And39);
        System.out.printf("From 40 to 50: %.2f%%%n", pBtw40And50);
        System.out.printf("Invalid numbers: %.2f%%%n", pUnknown);

    }
}
