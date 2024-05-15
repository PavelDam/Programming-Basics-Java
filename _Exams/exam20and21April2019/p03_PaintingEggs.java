package Exam20and21April2019;

import java.util.Scanner;

public class P03PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String eggsSize = scanner.nextLine();
        String eggsColor = scanner.nextLine();
        int eggsPackCount = Integer.parseInt(scanner.nextLine());
        int eggsPackPrice = 0;

        switch (eggsSize) {
            case "Large":
                switch (eggsColor) {
                    case "Red":
                        eggsPackPrice = 16;
                        break;
                    case "Green":
                        eggsPackPrice = 12;
                        break;
                    case "Yellow":
                        eggsPackPrice = 9;
                        break;
                }
                break;
            case "Medium":
                switch (eggsColor) {
                    case "Red":
                        eggsPackPrice = 13;
                        break;
                    case "Green":
                        eggsPackPrice = 9;
                        break;
                    case "Yellow":
                        eggsPackPrice = 7;
                        break;
                }
                break;
            case "Small":
                switch (eggsColor) {
                    case "Red":
                        eggsPackPrice = 9;
                        break;
                    case "Green":
                        eggsPackPrice = 8;
                        break;
                    case "Yellow":
                        eggsPackPrice = 5;
                        break;
                }
                break;
        }
        double income = eggsPackPrice * eggsPackCount;
        double expenses = income * 0.35;
        double total = income - expenses;
        System.out.printf("%.2f leva.", total);
    }
}
