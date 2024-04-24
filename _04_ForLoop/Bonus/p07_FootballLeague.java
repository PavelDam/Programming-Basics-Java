package L04ForLoop.Bonus;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());

        int fansA = 0;
        int fansB = 0;
        int fansV = 0;
        int fansG = 0;

        for (int i = 1; i <= fans; i++) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    fansA += 1;
                    break;
                case "B":
                    fansB += 1;
                    break;
                case "V":
                    fansV += 1;
                    break;
                case "G":
                    fansG += 1;
                    break;
            }
        }
        double pFansA = 1.0 * fansA / fans * 100;
        double pFansB = 1.0 * fansB / fans * 100;
        double pFansV = 1.0 * fansV / fans * 100;
        double pFansG = 1.0 * fansG / fans * 100;
        double totalFans = fansA + fansB + fansV + fansG;
        double pTotalFans = totalFans / capacity * 100;

        System.out.printf("%.2f%%%n", pFansA);
        System.out.printf("%.2f%%%n", pFansB);
        System.out.printf("%.2f%%%n", pFansV);
        System.out.printf("%.2f%%%n", pFansG);
        System.out.printf("%.2f%%%n", pTotalFans);

    }
}
