package L01FirstStepInCoding.Exercises;

import java.util.Scanner;

public class BasketballEquipment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        int yerlyTax = Integer.parseInt(scanner.nextLine());

        double shoesPrice = yerlyTax - (yerlyTax * 0.40);
        double clothPrice = shoesPrice - (shoesPrice * 0.20);
        double ball = clothPrice * 0.25;
        double accessories = ball * 0.2;

        double totalSum = yerlyTax + shoesPrice + clothPrice + ball + accessories;

        System.out.println(totalSum);
    }
}
