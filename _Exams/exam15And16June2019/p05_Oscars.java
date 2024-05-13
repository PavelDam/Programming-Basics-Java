package Exam15And16June2019;

import java.util.Scanner;

public class P05Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int juri = Integer.parseInt(scanner.nextLine());
        double currentPoints = 0;

        for (int i = 1; i <= juri; i++) {
            String juriName = scanner.nextLine();
            int lenghtJuriName = juriName.length();
            double juriPoints = Double.parseDouble(scanner.nextLine());

            currentPoints = (lenghtJuriName * juriPoints) / 2;
            academyPoints += currentPoints;

            if (academyPoints > 1250.5) {
                break;
            }
        }
        if (academyPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, academyPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5-academyPoints);
        }
    }
}
