package Exam9And10March2019;

import java.util.Scanner;

public class P03Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String device = scanner.nextLine();

        double difficulty = 0;
        double performance = 0;

        if (country.equals("Russia")) {
            switch (device) {
                case "ribbon":
                    difficulty = 9.100;
                    performance = 9.400;
                    break;
                case "hoop":
                    difficulty = 9.300;
                    performance = 9.800;
                    break;
                case "rope":
                    difficulty = 9.600;
                    performance = 9.000;
                    break;
            }
        } else if (country.equals("Bulgaria")) {
            switch (device) {
                case "ribbon":
                    difficulty = 9.600;
                    performance = 9.400;
                    break;
                case "hoop":
                    difficulty = 9.550;
                    performance = 9.750;
                    break;
                case "rope":
                    difficulty = 9.500;
                    performance = 9.400;
                    break;
            }
        } else if (country.equals("Italy")) {
            switch (device) {
                case "ribbon":
                    difficulty = 9.200;
                    performance = 9.500;
                    break;
                case "hoop":
                    difficulty = 9.450;
                    performance = 9.350;
                    break;
                case "rope":
                    difficulty = 9.700;
                    performance = 9.150;
                    break;
            }
        }
        double totalScore = difficulty + performance;
        double neededScore = 20 - totalScore;
        double pNeededScore = neededScore / 20 * 100;

        System.out.printf("The team of %s get %.3f on %s.%n", country, totalScore, device);
        System.out.printf("%.2f%%", pNeededScore);

    }
}
