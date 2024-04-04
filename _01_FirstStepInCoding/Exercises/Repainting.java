package L01FirstStepInCoding.Exercises;

import java.util.Scanner;

public class Repainting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // найлон - 1.50 лв/кв.м + 2кв.м към целия найлон
        // боя - 14.50 лв/литър + 10% от общото количество
        // рзредител - 5.00 лв/литър
        // торбички - 0.40 лв
        // сума за труд = 30% от разходите за всички материали

        int neededNylon = Integer.parseInt(scanner.nextLine());
        int neededPaint = Integer.parseInt(scanner.nextLine());
        int neededThiner = Integer.parseInt(scanner.nextLine());
        int neededHours = Integer.parseInt(scanner.nextLine());
        double bags = 0.40;

        double totalNylon = (neededNylon + 2) * 1.50;
        double totalPaint = (neededPaint + (neededPaint * 0.1)) * 14.50;
        double totalThiner = neededThiner * 5.00;
        double totalSumMaterials = bags + totalNylon + totalPaint + totalThiner;
        double pricePerHour = totalSumMaterials * 0.30;

        double total = totalSumMaterials + (neededHours * pricePerHour);

        System.out.println(total);

        //Да се отпечата на конзолата един ред:
        //•	"{сумата на всички разходи}"
    }
}
