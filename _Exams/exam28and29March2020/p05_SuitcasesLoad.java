package Exam28and29March2020;

import java.util.Scanner;

public class P05SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bootCapacity = Double.parseDouble(scanner.nextLine());
        double freeCap = bootCapacity;

        String input = scanner.nextLine();
        int suitcCount = 0;


        while (!input.equals("End")) {
            double suitcase = Double.parseDouble(input);

            suitcCount++;

            if (suitcCount % 3 == 0) {
                suitcase = suitcase * 1.10;
            }
            freeCap -= suitcase;
            if (freeCap < 0) {
                System.out.println("No more space!");
                suitcCount--;
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("End")) {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", suitcCount);
    }
}
