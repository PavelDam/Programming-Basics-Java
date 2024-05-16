package Exam28and29March2020;

import java.util.Scanner;

public class P06TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        double totalMoney = 0;
        int winDays = 0;
        int loseDays = 0;

        for (int i = 1; i <= days; i++) {
            String input = scanner.nextLine();

            double todayMoney = 0;
            int winToday = 0;
            int loseToday = 0;
            while (!input.equals("Finish")) {
                String wOL = scanner.nextLine();
                switch (wOL) {
                    case "win":
                        todayMoney += 20;
                        winToday++;
                        winDays++;
                        break;
                    case "lose":
                        loseToday++;
                        loseDays++;
                        break;
                }

                input = scanner.nextLine();
            }
            if (winToday > loseToday) {
                todayMoney = todayMoney * 1.10;
            }
            totalMoney += todayMoney;
        }
        if (winDays > loseDays) {
            totalMoney = totalMoney * 1.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        } else if (winDays < loseDays) {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }
    }
}
