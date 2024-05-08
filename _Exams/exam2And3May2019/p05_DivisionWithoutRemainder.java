package Exam2And3May2019;

import java.util.Scanner;

public class P05DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        for (int i = 1; i <= num; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum % 2 == 0) {
                p1 += 1;
            }
            if (currentNum % 3 == 0) {
                p2 += 1;
            }
            if (currentNum % 4 == 0) {
                p3 += 1;
            }
        }
        double pP1 = 1.0 * p1 / num * 100;
        double pP2 = 1.0 * p2 / num * 100;
        double pP3 = 1.0 * p3 / num * 100;

        System.out.printf("%.2f%%%n", pP1);
        System.out.printf("%.2f%%%n", pP2);
        System.out.printf("%.2f%%", pP3);
    }
}
