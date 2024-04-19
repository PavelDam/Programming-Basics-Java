package L03ConditionalStatementsAdvanced.Bonus;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorCyclist = Integer.parseInt(scanner.nextLine());
        int seniorsCyclist = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();
        double juniorsTax = 0;
        double seniorsTax = 0;

        switch (trace) {
            case "trail":
                juniorsTax = 5.50;
                seniorsTax = 7;
                break;
            case "cross-country":
                juniorsTax = 8;
                seniorsTax = 9.50;
                if (juniorCyclist + seniorsCyclist >= 50) {
                    juniorsTax = juniorsTax * 0.75;
                    seniorsTax = seniorsTax * 0.75;
                }
                break;
            case "downhill":
                juniorsTax = 12.25;
                seniorsTax = 13.75;
                break;
            case "road":
                juniorsTax = 20;
                seniorsTax = 21.50;
                break;
        }
        double totalTax = (juniorCyclist * juniorsTax + seniorsCyclist * seniorsTax) * 0.95;
        System.out.printf("%.2f",totalTax);
    }

}
