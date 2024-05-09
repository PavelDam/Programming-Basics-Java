package Exam6And7July2019;

import java.util.Scanner;

public class P05PcGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gamesSale = Integer.parseInt(scanner.nextLine());

        int hearthstone = 0;
        int fornite = 0;
        int overwatch = 0;
        int others = 0;

        for (int i = 1; i <= gamesSale; i++) {
            String gameName = scanner.nextLine();
            switch (gameName) {
                case "Hearthstone":
                    hearthstone += 1;
                    break;
                case "Fornite":
                    fornite += 1;
                    break;
                case "Overwatch":
                    overwatch += 1;
                    break;
                default:
                    others += 1;
                    break;
            }
        }
        double pHeathstone = 1.0 * hearthstone / gamesSale * 100;
        double pFornite = 1.0 * fornite / gamesSale * 100;
        double pOverwatch = 1.0 * overwatch / gamesSale * 100;
        double pOthers = 1.0 * others / gamesSale * 100;
        System.out.printf("Hearthstone - %.2f%%%n", pHeathstone);
        System.out.printf("Fornite - %.2f%%%n", pFornite);
        System.out.printf("Overwatch - %.2f%%%n", pOverwatch);
        System.out.printf("Others - %.2f%%", pOthers);
    }
}
