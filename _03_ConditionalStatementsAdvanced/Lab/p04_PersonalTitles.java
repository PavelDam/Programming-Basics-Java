package L03ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P04PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if (age >= 16) {
            if (gender.equals("m")) {
                System.out.println("Mr.");
            }

        } else {
            if (gender.equals("m")) {
                System.out.println("Master");
            }
        }

        if (age >= 16) {
            if (gender.equals("f")) {
                System.out.println("Ms.");
            }
        } else {
            if (gender.equals("f")) {
                System.out.println("Miss");
            }
        }

    }
}
