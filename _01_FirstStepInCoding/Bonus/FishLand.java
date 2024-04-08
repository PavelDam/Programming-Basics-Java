package L01FirstStepInCoding.Bonus;

import java.util.Scanner;

public class FishLand {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // palamud - skumriq * 1.60;
        // safrid -  caca * 1.80;
        // midi   - 7.50 lv/kg

        double skumriqPrcieKg = Double.parseDouble(scanner.nextLine());
        double cacaPriceKg = Double.parseDouble(scanner.nextLine());
        double palamudKg = Double.parseDouble(scanner.nextLine());
        double safridKg = Double.parseDouble(scanner.nextLine());
        double midiKg = Double.parseDouble(scanner.nextLine());

        double palamudPriceKg = skumriqPrcieKg * 1.60;
        double safridPriceKg = cacaPriceKg * 1.80;

        double totalPricePalamud = palamudPriceKg * palamudKg;
        double totalPriceSafrid = safridPriceKg * safridKg;
        double totalPriceMidi = midiKg * 7.50;
        double totalSum = totalPriceMidi + totalPricePalamud + totalPriceSafrid;

        System.out.printf("%.2f", totalSum);
    }
}
