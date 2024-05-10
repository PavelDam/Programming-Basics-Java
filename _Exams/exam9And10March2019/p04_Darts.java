package Exam9And10March2019;

import java.util.Scanner;

public class P04Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();
        int startigPoints = 301;
        String input = scanner.nextLine();
        int totalPoints = 0;
        int shots = 0;
        int badShots = 0;
        while (!input.equals("Retire")) {
            int points = Integer.parseInt(scanner.nextLine());
            shots++;

            switch (input) {
                case "Single":
                    points = points;
                    break;
                case "Double":
                    points = points * 2;
                    break;
                case "Triple":
                    points = points * 3;
                    break;
            }
            totalPoints += points;
            if (totalPoints == startigPoints) {
                break;
            }
            if (totalPoints > startigPoints) {
                totalPoints -= points;
                badShots++;
                shots--;
                input = scanner.nextLine();
                continue;
            }
            input = scanner.nextLine();
        }
        if (totalPoints == startigPoints) {
            System.out.printf("%s won the leg with %d shots.", playerName, shots);
        }
        if (input.equals("Retire")) {
            System.out.printf("%s retired after %d unsuccessful shots.", playerName, badShots);
        }
    }
}
