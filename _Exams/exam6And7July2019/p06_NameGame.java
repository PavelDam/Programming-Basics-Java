package Exam6And7July2019;

import java.util.Scanner;

public class P06NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String winnerName = "";
        int maxPoints = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            String name = input;
            int nameLenght = name.length();

            int totalPoints = 0;
            for (int i = 0; i < nameLenght; i++) {
                int point = Integer.parseInt(scanner.nextLine());
                char symbol = name.charAt(i);
                int ascii = (int) symbol;

                if (point == ascii) {
                    totalPoints += 10;
                } else {
                    totalPoints += 2;
                }
            }
            if (totalPoints >= maxPoints) {
                maxPoints = totalPoints;
                winnerName = name;
            }
            input = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", winnerName, maxPoints);
    }
}
