package Exam15And16June2019;

import java.util.Scanner;

public class P01SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double durationWithoutAdvertising = Double.parseDouble(scanner.nextLine());

        double advertising = durationWithoutAdvertising * 0.2;
        double durationWithAdvertising = durationWithoutAdvertising + advertising;
        double seasonLastEpisodeDuration = seasons * 10;

        double totalTime = seasons * episodes * durationWithAdvertising + seasonLastEpisodeDuration;
        int time = (int) Math.floor(totalTime);
        System.out.printf("Total time needed to watch the %s series is %d minutes.", name, time);
    }
}
