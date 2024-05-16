package Exam28and29March2020;

import java.util.Scanner;

public class P04FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());

        double foodEated = 0;
        int totalDogFood = 0;
        int totalCatFood = 0;
        double biscuits = 0;


        for (int i = 1; i <= days; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());

            totalDogFood += dogFood;
            totalCatFood += catFood;
            foodEated += dogFood + catFood;
            if (i % 3 == 0) {
                biscuits = (dogFood + catFood) * 0.10;
            }
        }
        double pEated = foodEated / totalFood * 100;
        double pDog = totalDogFood / foodEated * 100;
        double pCat = totalCatFood / foodEated * 100;
        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", pEated);
        System.out.printf("%.2f%% eaten from the dog.%n", pDog);
        System.out.printf("%.2f%% eaten from the cat.%n", pCat);

    }
}
