package Exam9And10March2019;

import java.util.Scanner;

public class P05TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournamets = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int wins = 0;
        int finalist = 0;
        int semiFinalist = 0;
        int tournamentPoints = 0;

        for (int i = 1; i <= tournamets; i++) {
            String position = scanner.nextLine();
            switch (position) {
                case "W":
                    tournamentPoints += 2000;
                    wins += 1;
                    break;
                case "F":
                    tournamentPoints += 1200;
                    finalist += 1;
                    break;
                case "SF":
                    tournamentPoints += 720;
                    semiFinalist += 1;
            }
        }
        int totalPoints = tournamentPoints + startingPoints;
        double averagePoints = 1.0 * tournamentPoints / tournamets;
        int average = (int) Math.floor(averagePoints);
        double pWins = 1.0 * wins / tournamets * 100;
        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %d%n", average);
        System.out.printf("%.2f%%", pWins);
    }
}
