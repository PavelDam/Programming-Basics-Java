package Exam20and21April2019;

import java.util.Scanner;

public class P04EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEggs = Integer.parseInt(scanner.nextLine());
        int secondEggs = Integer.parseInt(scanner.nextLine());

        int fPlayerEggs = firstEggs;
        int sPlayerEggs = secondEggs;

        boolean isValid = true;
        String winner = scanner.nextLine();
        while (!winner.equals("End")) {

            if (winner.equals("one")) {
                sPlayerEggs--;
            } else if (winner.equals("two")) {
                fPlayerEggs--;
            }
            if (fPlayerEggs == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", sPlayerEggs);
                isValid = false;
                break;
            }
            if (sPlayerEggs == 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.",fPlayerEggs);
                isValid = false;
                break;
            }

                winner = scanner.nextLine();
        }
        if (isValid){
            System.out.printf("Player one has %d eggs left.%n",fPlayerEggs);
            System.out.printf("Player two has %d eggs left.",sPlayerEggs);
        }
        }

}
