package Exam6And7July2019;

import java.util.Scanner;

public class P05FootballTournaments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int matchCount = Integer.parseInt(scanner.nextLine());

        int winPoints = 0;
        int dPoints = 0;
        int losePoints = 0;
        int w = 0;
        int d = 0;
        int l = 0;

        if (matchCount < 1) {
            System.out.printf("%s hasn't played any games during this season.", name);
            return;
        } else {
            for (int i = 1; i <= matchCount; i++) {
                String result = scanner.nextLine();
                switch (result) {
                    case "W":
                        winPoints += 3;
                        w += 1;
                        break;
                    case "D":
                        dPoints += 1;
                        d += 1;
                        break;
                    case "L":
                        losePoints += 0;
                        l += 1;
                        break;
                }

            }
        }
        int totalPoints = winPoints + dPoints + losePoints;
        double pWin = 1.0 * w / matchCount * 100;
        System.out.printf("%s has won %d points during this season.%n", name, totalPoints);
        System.out.println("Total stats:");
        System.out.printf("## W: %d%n", w);
        System.out.printf("## D: %d%n", d);
        System.out.printf("## L: %d%n", l);
        System.out.printf("Win rate: %.2f%%", pWin);

    }
}
