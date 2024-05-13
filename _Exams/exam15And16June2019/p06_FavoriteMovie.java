package Exam15And16June2019;

import java.util.Scanner;

public class P06FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int limit = 7;
        int movieCount = 0;
        int points = 0;

        int maxPoints = Integer.MIN_VALUE;
        String movieName = "";

        while (!input.equals("STOP")) {
            movieCount++;
            if (movieCount == limit) {
                break;
            }
            String name = input;
            int nameLenght = name.length();

            int currentMoviePoints = 0;

            for (int i = 0; i < nameLenght; i++) {
                char symbol = name.charAt(i);
                int assci = (int) symbol;
                if (Character.isUpperCase(symbol)) {
                    currentMoviePoints += assci - nameLenght;
                } else if (Character.isLowerCase(symbol)) {
                    currentMoviePoints += assci - (2 * nameLenght);
                } else {
                    currentMoviePoints += assci;
                }
            }
            if (currentMoviePoints > maxPoints) {
                maxPoints = currentMoviePoints;
                movieName = name;
            }
            input = scanner.nextLine();
        }
        if (movieCount == limit) {
            System.out.println("The limit is reached.");
            System.out.printf("The best movie for you is %s with %d ASCII sum.", movieName, maxPoints);
        } else {
            System.out.printf("The best movie for you is %s with %d ASCII sum.", movieName, maxPoints);
        }
    }
}
