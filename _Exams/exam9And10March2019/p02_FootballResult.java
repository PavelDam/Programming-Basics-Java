package Exam9And10March2019;

import java.util.Scanner;

public class P02FootballResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstMatchResult = scanner.nextLine();
        String secondMatchResult = scanner.nextLine();
        String thirdMatchResult = scanner.nextLine();

        int win = 0;
        int lost = 0;
        int draw = 0;

        char first = firstMatchResult.charAt(0);
        char first1 = firstMatchResult.charAt(2);
        char second = secondMatchResult.charAt(0);
        char second1 = secondMatchResult.charAt(2);
        char third = thirdMatchResult.charAt(0);
        char third1 = thirdMatchResult.charAt(2);

        if (first > first1) {
            win += 1;
        } else if (first < first1) {
            lost += 1;
        } else if (first == first1) {
            draw += 1;
        }
        if (second > second1) {
            win += 1;
        } else if (second < second1) {
            lost += 1;
        } else if (second == second1) {
            draw += 1;
        }
        if (third > third1) {
            win += 1;
        } else if (third < third1) {
            lost += 1;
        } else if (third == third1) {
            draw += 1;
        }
        System.out.printf("Team won %d games.%n", win);
        System.out.printf("Team lost %d games.%n", lost);
        System.out.printf("Drawn games: %d", draw);
    }
}
