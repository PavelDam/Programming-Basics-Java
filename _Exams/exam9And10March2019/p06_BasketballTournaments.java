package Exam9And10March2019;

import java.util.Scanner;

public class P06BasketballTournaments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int matchCount = 0;
        int totalWins = 0;
        int totalLoses = 0;

        while (!input.equals("End of tournaments")) {
            int matches = Integer.parseInt(scanner.nextLine());
            int winCount = 0;
            int loseCount = 0;

            for (int i = 1; i <= matches; i++) {
                int desiPoints = Integer.parseInt(scanner.nextLine());
                int opponentPoints = Integer.parseInt(scanner.nextLine());
                matchCount++;
                if (desiPoints > opponentPoints) {
                    winCount++;
                    totalWins++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, input, (desiPoints - opponentPoints));
                } else if (desiPoints < opponentPoints) {
                    loseCount++;
                    totalLoses++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, input, (opponentPoints - desiPoints));
                }
            }
            input = scanner.nextLine();
        }
        double pWins = 1.0 * totalWins / matchCount * 100;
        double pLoese = 1.0 * totalLoses / matchCount * 100;
        System.out.printf("%.2f%% matches win%n", pWins);
        System.out.printf("%.2f%% matches lost%n", pLoese);
    }
}
