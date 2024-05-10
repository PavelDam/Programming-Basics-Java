package Exam9And10March2019;

import java.util.Scanner;

public class P04GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namePlayer1 = scanner.nextLine();
        ;
        String namePlayer2 = scanner.nextLine();
        ;
        String input = scanner.nextLine();

        int pointsPlayer1 = 0;
        int pointsPlayer2 = 0;
        int totalP1 = 0;
        int totalP2 = 0;

        while (!input.equals("End of game")) {
            int player1 = Integer.parseInt(input);
            int player2 = Integer.parseInt(scanner.nextLine());;

            if (player1 > player2) {
                pointsPlayer1 = player1 - player2;
                totalP1 += pointsPlayer1;
            }
            if (player2 > player1) {
                pointsPlayer2 = player2 - player1;
                totalP2 += pointsPlayer2;
            }
            if (player1 == player2) {
                System.out.println("Number wars!");
                int player1NW = Integer.parseInt(scanner.nextLine());;
                int player2NW = Integer.parseInt(scanner.nextLine());;
                if (player1NW > player2NW) {
                    System.out.printf("%s is winner with %d points", namePlayer1, totalP1);
                } else if (player1NW < player2NW) {
                    System.out.printf("%s is winner with %d points", namePlayer2, totalP2);
                }
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("End of game")) {
            System.out.printf("%s has %d points%n", namePlayer1, totalP1);
            System.out.printf("%s has %d points", namePlayer2, totalP2);
        }
    }
}
