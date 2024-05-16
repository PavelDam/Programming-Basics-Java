package Exam28and29March2020;

import java.util.Scanner;

public class P04TrakingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Проверка по брой катерачи
        //•	Група до 5 човека – изкачват Мусала
        //•	Група от 6 до 12 човека – изкачват Монблан
        //•	Група от 13 до 25 човека – изкачват Килиманджаро
        //•	Група от 26 до 40 човека –  изкачват К2
        //•	Група от 41 или повече човека – изкачват Еверест
        int groups = Integer.parseInt(scanner.nextLine());

        int totalPeoples = 0;

        int musala = 0;
        int montblan = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= groups; i++) {
            int peoplesInGroup = Integer.parseInt(scanner.nextLine());
            totalPeoples += peoplesInGroup;
            if (peoplesInGroup <= 5) {
                musala += peoplesInGroup;
            } else if (peoplesInGroup <= 12) {
                montblan += peoplesInGroup;
            } else if (peoplesInGroup <= 25) {
                kilimanjaro += peoplesInGroup;
            } else if (peoplesInGroup <= 40) {
                k2 += peoplesInGroup;
            } else {
                everest += peoplesInGroup;
            }
        }
        double pMusala = 1.0 * musala / totalPeoples * 100;
        double pMontblan = 1.0 * montblan / totalPeoples * 100;
        double pKilimanjaro = 1.0 * kilimanjaro / totalPeoples * 100;
        double pK2 = 1.0 * k2 / totalPeoples * 100;
        double pEverest = 1.0 * everest / totalPeoples * 100;

        System.out.printf("%.2f%%%n", pMusala);
        System.out.printf("%.2f%%%n", pMontblan);
        System.out.printf("%.2f%%%n", pKilimanjaro);
        System.out.printf("%.2f%%%n", pK2);
        System.out.printf("%.2f%%%n", pEverest);

    }
}
