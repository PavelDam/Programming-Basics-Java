package Exam6And7April2019;

import java.util.Scanner;

public class P05MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moviesCount = Integer.parseInt(scanner.nextLine());

        double averageRating = 0;
        double maxRating = Double.MIN_VALUE;
        double minRating = Double.MAX_VALUE;
        String maxRatingMovie = "";
        String minRatingMovie = "";

        for (int i = 1; i <= moviesCount; i++) {
            String movieName = scanner.nextLine();
            double movieRating = Double.parseDouble(scanner.nextLine());
            averageRating += movieRating;

            if (movieRating > maxRating) {
                maxRating = movieRating;
                maxRatingMovie = movieName;
            }
            if (movieRating < minRating) {
                minRating = movieRating;
                minRatingMovie = movieName;
            }
        }
        double average = averageRating / moviesCount;
        System.out.printf("%s is with highest rating: %.1f%n", maxRatingMovie, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", minRatingMovie, minRating);
        System.out.printf("Average rating: %.1f", average);
    }
}
