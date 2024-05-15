package Exam20and21April2019;

import java.util.Scanner;

public class P05EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sugarPack = 950;
        int flourPack = 750;

        int breedCount = Integer.parseInt(scanner.nextLine());

        int usedSugar = 0;
        int usedFlour = 0;


        int maxSugar = 0;
        int maxFlour = 0;

        for (int i = 1; i <= breedCount; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());

            usedSugar += sugar;
            usedFlour += flour;
            if (sugar > maxSugar) {
                maxSugar = sugar;
            }
            if (flour > maxFlour) {
                maxFlour = flour;
            }
        }

        int neededSugarPacks = (int) Math.ceil((double) usedSugar / sugarPack);
        int neededFlourPacks = (int) Math.ceil((double) usedFlour / flourPack);

        System.out.printf("Sugar: %d%n", neededSugarPacks);
        System.out.printf("Flour: %d%n", neededFlourPacks);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
    }
}
