package L02ConditionalStatements.Bonus;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От лозе с площ X квадратни метри се заделя 40% от реколтата за производство на вино.
        // От 1 кв.м лозе се изкарват Y килограма грозде. За 1 литър вино са нужни 2,5 кг. грозде.
        // Желаното количество вино за продан е Z литра.
        int xVineyardArea = Integer.parseInt(scanner.nextLine());
        double yGrapeSqm = Double.parseDouble(scanner.nextLine());
        int zNeededLitersVine = Integer.parseInt(scanner.nextLine());
        int emoloyees = Integer.parseInt(scanner.nextLine());

        double grapeForVine = xVineyardArea * 0.4;
        double kgForOneLiterVine = 2.5;
        double totalKgForVine = grapeForVine * yGrapeSqm;
        double totalLitersVine = totalKgForVine / kgForOneLiterVine;

        if (totalLitersVine < zNeededLitersVine) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(zNeededLitersVine - totalLitersVine));
        } else {
            double litersPerPerson = (totalLitersVine - zNeededLitersVine) / emoloyees;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n%.0f liters left -> %.0f liters per person.", Math.floor(totalLitersVine), Math.ceil(totalLitersVine - zNeededLitersVine), Math.ceil(litersPerPerson));

        }
    }
}
//•	Ако произведеното вино е по-малко от нужното:
//o	“It will be a tough winter! More {недостигащо вино} liters wine needed.”
//	Резултатът трябва да е закръглен към по-ниско цяло число
//•	Ако произведеното вино е колкото или повече от нужното:
//o	“Good harvest this year! Total wine: {общо вино} liters.”
//	Резултатът трябва да е закръглен към по-ниско цяло число
//o	“{Оставащо вино} liters left -> {вино за 1 работник} liters per person.”
//	И двата резултата трябва да са закръглени към по-високото цяло число