package L01FirstStepInCoding.Bonus;

import java.util.Scanner;

public class HousePainting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // стени - зелена боя - разход 1л/3.4 кв.м
        // покрив - червена боя - разход 1л/4.3 кв.м

        // площ предна стена = (х * х)-(1.2*2)  площ задна стена = х * х
        // площ странични стени = ((x * y)*2) - ((1.5 * 1.5)*2)
        // площ покрив = (x * y)*2 + (0.5 * х * h)*2

        // •Литрите зелена боя
        //•	Литритe червена боя
        //  Форматирани до вторият знак след десетичната запетая.


        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double areaSideWalls = (x * y) * 2 - (1.5 * 1.5) * 2;
        double areaFrontBackWalls = (x * x) * 2 - (1.2 * 2);
        double areaWalls = areaSideWalls + areaFrontBackWalls;
        double areaCeiling = (x * y) * 2 + (0.5 * x * h) * 2;

        double neededLitersGreen = areaWalls / 3.4;
        double neededLitersRed = areaCeiling / 4.3;

        System.out.printf("%.2f%n%.2f", neededLitersGreen, neededLitersRed);


    }
}
