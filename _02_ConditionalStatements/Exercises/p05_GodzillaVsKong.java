package L02ConditionalStatements.Exercises;

import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int stats = Integer.parseInt(scanner.nextLine());
        double statsCloth = Double.parseDouble(scanner.nextLine());


        double deckor = budget * 0.1;
        if (stats > 150) {
            statsCloth = statsCloth * 0.9;

        }
        double expenses = stats * statsCloth + deckor;
        if (expenses > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", expenses - budget);
        } else  {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - expenses);
        }
    }
}
//На конзолата трябва да се отпечатат два реда:
//•	Ако  парите за декора и дрехите са повече от бюджета:
//o	"Not enough money!"
//o	"Wingard needs {парите недостигащи за филма} leva more."
//•	Ако парите за декора и дрехите са по малко или равни на бюджета:
//o	"Action!"
//o	"Wingard starts filming with {останалите пари} leva left."
//Резултатът трябва да е форматиран до втория знак след десетичната запетая.