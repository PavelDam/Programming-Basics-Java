package Exam20and21April2019;

import java.util.Scanner;

public class P05EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsCount = Integer.parseInt(scanner.nextLine());

        int redEggs = 0;
        int orangeEggs = 0;
        int blueEggs = 0;
        int greenEggs = 0;

        int maxEggs = 0;
        String maxEggsName = "";

        for (int i = 1; i <= eggsCount; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    redEggs++;
                    break;
                case "orange":
                    orangeEggs++;
                    break;
                case "blue":
                    blueEggs++;
                    break;
                case "green":
                    greenEggs++;
                    break;
            }
            if (greenEggs > maxEggs) {
                maxEggs = greenEggs;
                maxEggsName = color;
            } else if (orangeEggs > maxEggs) {
                maxEggs = orangeEggs;
                maxEggsName = color;
            } else if (redEggs > maxEggs) {
                maxEggs = redEggs;
                maxEggsName = color;
            } else if (blueEggs > maxEggs) {
                maxEggs = blueEggs;
                maxEggsName = color;
            }
        }
        System.out.printf("Red eggs: %d%n", redEggs);
        System.out.printf("Orange eggs: %d%n", orangeEggs);
        System.out.printf("Blue eggs: %d%n", blueEggs);
        System.out.printf("Green eggs: %d%n", greenEggs);
        System.out.printf("Max eggs: %d -> %s", maxEggs, maxEggsName);
    }
}
