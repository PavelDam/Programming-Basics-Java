package L04ForLoop.Exercises;

import java.util.Scanner;

public class P03Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNum = Integer.parseInt(scanner.nextLine());

        int countGroup1 = 0;
        int countGroup2 = 0;
        int countGroup3 = 0;
        int countGroup4 = 0;
        int countGroup5 = 0;

        for (int i = 1; i <= countNum; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum < 200) {
                countGroup1 += 1;
            } else if (currentNum >= 200 && currentNum <= 399) {
                countGroup2 += 1;
            } else if (currentNum >= 400 && currentNum <= 599) {
                countGroup3 += 1;
            } else if (currentNum >= 600 && currentNum <= 799) {
                countGroup4 += 1;
            } else if (currentNum >= 800) {
                countGroup5 += 1;
            }
        }
        double p1 = 1.0 * countGroup1 / countNum * 100;
        double p2 = 1.0 * countGroup2 / countNum * 100;
        double p3 = 1.0 * countGroup3 / countNum * 100;
        double p4 = 1.0 * countGroup4 / countNum * 100;
        double p5 = 1.0 * countGroup5 / countNum * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);

    }
}
