package L04ForLoop.Bonus;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = Integer.parseInt(scanner.nextLine());
        int internet = 15;
        int water = 20;

        int waterExp = 0;
        int internetExp = 0;
        double elExp = 0;
        double otherExp = 0;

        for (int i = 1; i <= month; i++) {
            double el = Double.parseDouble(scanner.nextLine());
            elExp += el;
            waterExp += 20;
            internetExp += 15;
            otherExp += (el + water + internet) * 1.2;

        }
        double average = (waterExp + internetExp + elExp + otherExp) / month;
        System.out.printf("Electricity: %.2f lv%n", elExp);
        System.out.printf("Water: %.2f lv%n", 1.0 * waterExp);
        System.out.printf("Internet: %.2f lv%n", 1.0 * internetExp);
        System.out.printf("Other: %.2f lv%n", otherExp);
        System.out.printf("Average: %.2f lv", average);
    }
}
