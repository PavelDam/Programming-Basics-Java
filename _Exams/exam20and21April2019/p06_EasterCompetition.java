package Exam20and21April2019;

import java.util.Scanner;

public class P06EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int breedCount = Integer.parseInt(scanner.nextLine());
        int maxPoints = 0;
        String maxPName = "";

        for (int i = 1; i <= breedCount; i++) {
            String input = scanner.nextLine();
            int totalPoints = 0;
            String command = scanner.nextLine();
            while (!command.equals("Stop")) {
                int points = Integer.parseInt(command);

                totalPoints += points;

                command = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", input, totalPoints);
            if (totalPoints > maxPoints) {
                maxPoints = totalPoints;
                maxPName = input;
                System.out.printf("%s is the new number 1!%n", input);
            }
        }
        System.out.printf("%s won competition with %d points!", maxPName, maxPoints);
    }
}
