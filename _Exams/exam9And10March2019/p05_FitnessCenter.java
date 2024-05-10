package Exam9And10March2019;

import java.util.Scanner;

public class P05FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peoples = Integer.parseInt(scanner.nextLine());

        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int proteinShake = 0;
        int proteinBar = 0;

        for (int i = 1; i <= peoples; i++) {
            String activity = scanner.nextLine();
            switch (activity) {
                case "Back":
                    back += 1;
                    break;
                case "Chest":
                    chest += 1;
                    break;
                case "Legs":
                    legs += 1;
                    break;
                case "Abs":
                    abs += 1;
                    break;
                case "Protein shake":
                    proteinShake += 1;
                    break;
                case "Protein bar":
                    proteinBar += 1;
                    break;
            }
        }
        double pTrain = 1.0 * (back + chest + legs + abs) / peoples * 100;
        double pBuyers = 1.0 * (proteinShake + proteinBar) / peoples * 100;

        System.out.printf("%d - back%n", back);
        System.out.printf("%d - chest%n", chest);
        System.out.printf("%d - legs%n", legs);
        System.out.printf("%d - abs%n", abs);
        System.out.printf("%d - protein shake%n", proteinShake);
        System.out.printf("%d - protein bar%n", proteinBar);
        System.out.printf("%.2f%% - work out%n", pTrain);
        System.out.printf("%.2f%% - protein", pBuyers);

    }
}
