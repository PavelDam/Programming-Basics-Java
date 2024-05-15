package Exam20and21April2019;

import java.util.Scanner;

public class P02EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Един козунак струва 4лв.
        //•	Едно яйце струва 0.45лв.
        int guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        int eggs = guests * 2;
        double breedsD = guests/ 3.0;
        double breeds = Math.ceil(breedsD);

        double breedPrice = breeds * 4;
        double eggsPrice = eggs * 0.45;

        double totalSum = breedPrice + eggsPrice;
        if (budget >= totalSum) {
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n", breeds, eggs);
            System.out.printf("He has %.2f lv. left.", (budget - totalSum));
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", (totalSum - budget));
        }
    }
}
