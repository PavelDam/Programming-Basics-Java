package L01FirstStepInCoding.Exercises;

import java.util.Scanner;

public class FishTank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //обем на паралелепипед = а * b * h cm / 1000 за да минем в куб.метри
        // 1л вода = 1 дм

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine()) / 100;

        double volume = (a * b * h);
        double volumeLiters = volume / 1000;
        double neededLiters = volumeLiters * (1 - percent);

        System.out.println(neededLiters);


    }
}
