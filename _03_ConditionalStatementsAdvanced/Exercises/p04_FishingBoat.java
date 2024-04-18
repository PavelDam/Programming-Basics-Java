package L03ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermans = Integer.parseInt(scanner.nextLine());

        double rentPrice = 0;

        switch (season) {
            case "Spring":
                rentPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                rentPrice = 4200;
                break;
            case "Winter":
                rentPrice = 2600;
                break;
        }
        if (fishermans <= 6) {
            rentPrice = rentPrice * 0.9;
        } else if (fishermans <= 11) {
            rentPrice = rentPrice * 0.85;
        } else {
            rentPrice = rentPrice * 0.75;
        }
        if (fishermans % 2 == 0 && !(season.equals("Autumn"))) {
            rentPrice = rentPrice * 0.95;
        }
        if (budget >= rentPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - rentPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", rentPrice - budget);
        }

    }
}
//•	Ако бюджетът е достатъчен:
//"Yes! You have {останалите пари} leva left."
//•	Ако бюджетът НЕ Е достатъчен:
//"Not enough money! You need {сумата, която не достига} leva."
//Сумите трябва да са форматирани с точност до два знака след десетичната запетая.