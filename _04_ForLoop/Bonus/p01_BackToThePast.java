package L04ForLoop.Bonus;

import java.util.Scanner;

public class P01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double legacy = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());

        double sumToSpend = 0;
        int age = 18;


        for (int i = 1800; i <= yearToLive; i++) {
            if (i > 1800) {
                age++;
            }
            if (i % 2 == 0) {
                sumToSpend += 12000;
            } else {
                sumToSpend += 12000 + age * 50;
            }
        }

        if (legacy >= sumToSpend) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", legacy - sumToSpend);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", sumToSpend - legacy);
        }
    }
}
