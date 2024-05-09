package Exam6And7July2019;

import java.util.Scanner;

public class P02FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percentExp = Integer.parseInt(scanner.nextLine());

        if (nights > 7) {
            pricePerNight = pricePerNight * 0.95;
        }
        double totalExp = (nights * pricePerNight) + (budget * (1.0 * percentExp / 100));
        if (budget >= totalExp) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalExp);
        } else {
            System.out.printf("%.2f leva needed.", totalExp - budget);
        }
    }
}
