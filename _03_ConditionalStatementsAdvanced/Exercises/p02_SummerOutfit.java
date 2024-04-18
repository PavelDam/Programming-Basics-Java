package L03ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P02SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String partOfDay = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        if (degrees >= 10 && degrees <= 18) {
            if ("Morning".equals(partOfDay)) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if ("Afternoon".equals(partOfDay)) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if ("Evening".equals(partOfDay)) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }

        } else if (degrees > 18 && degrees <= 24) {
            if ("Morning".equals(partOfDay)) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if ("Afternoon".equals(partOfDay)) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if ("Evening".equals(partOfDay)) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        } else if (degrees >= 25) {
            if ("Morning".equals(partOfDay)) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if ("Afternoon".equals(partOfDay)) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            } else if ("Evening".equals(partOfDay)) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        System.out.printf("It's %s degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
