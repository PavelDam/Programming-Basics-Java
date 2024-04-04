package L01FirstStepInCoding.Exercises;

import java.util.Scanner;

public class FoodDelivery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // •Пилешко меню –  10.35 лв.
        //•	Меню с риба – 12.40 лв.
        //•	Вегетарианско меню  – 8.15 лв.
        //  доставка - 2.50 лв
        //  десерт = 20% от общата сума без доставка

        int countChicken = Integer.parseInt(scanner.nextLine());
        int countFish = Integer.parseInt(scanner.nextLine());
        int countVegan = Integer.parseInt(scanner.nextLine());

        double chickenPrice = countChicken * 10.35;
        double fishPrice = countFish * 12.40;
        double veganPrice = countVegan * 8.15;
        double dessert = (chickenPrice + fishPrice + veganPrice) * 0.20;

        double totalSum = chickenPrice + fishPrice + veganPrice + dessert + 2.50;

        System.out.println(totalSum);

        //Да се отпечата на конзолата един ред: "{цена на поръчката}"
    }
}
