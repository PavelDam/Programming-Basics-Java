package L02ConditionalStatements.Exercises;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Видеокарта – 250 лв./бр.
        //•	Процесор – 35% от цената на закупените видеокарти/бр.
        //•	Рам памет – 10% от цената на закупените видеокарти/бр
        // Ако броя на видеокартите е по-голям от този на процесорите получава 15% отстъпка от крайната сметка

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int memory = Integer.parseInt(scanner.nextLine());

        double priceProcessor = (videoCards * 250) * 0.35;
        double priceMemory = (videoCards * 250) * 0.1;

        double totalPrice = videoCards * 250 + processors * priceProcessor + memory * priceMemory;

        if (videoCards > processors) {
            totalPrice = totalPrice * 0.85;
        }
        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);

        } else {
            System.out.printf("Not enough money! You need %.2f leva more!",totalPrice - budget);
        }
    }
}
//•	Ако бюджета е достатъчен:
//"You have {остатъчен бюджет} leva left!"
//•	Ако сумата надхвърля бюджета:
//"Not enough money! You need {нужна сума} leva more!"
//Резултатът да се форматира до втория знак след десетичната запетая.
