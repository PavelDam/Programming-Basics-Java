package L04ForLoop.Exercises;

import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //	W - ако е победител получава 2000 точки
        //	F - ако е финалист получава 1200 точки
        //	SF - ако е полуфиналист получава 720 точки
        int tournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());


        int wins = 0;
        int pointsFromTournaments = 0;
        int totalPoints = 0;


        for (int i = 1; i <= tournaments; i++) {
            String position = scanner.nextLine();
            switch (position) {
                case "W":
                    pointsFromTournaments = 2000;
                    totalPoints += pointsFromTournaments;
                    wins += 1;
                    break;
                case "F":
                    pointsFromTournaments = 1200;
                    totalPoints += pointsFromTournaments;
                    break;
                case "SF":
                    pointsFromTournaments = 720;
                    totalPoints += pointsFromTournaments;
                    break;
            }

        }
        int finalPoints = startingPoints + totalPoints;
        int averagePoints = totalPoints / tournaments;
        double pWins = 1.0 * wins / tournaments * 100;

        System.out.printf("Final points: %d%n",finalPoints);
        System.out.printf("Average points: %d%n",averagePoints);
        System.out.printf("%.2f%%",pWins);

    }
}