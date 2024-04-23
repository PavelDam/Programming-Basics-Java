package L04ForLoop.Exercises;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double startPoints = Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());

        double points = 0;
        double totalPoints = startPoints + 0;

        for (int i = 1; i <= juryCount; i++) {
            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());
            points = (juryName.length() * juryPoints) / 2;
            totalPoints += points;

            if (totalPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
                break;
            }
        }
        if (totalPoints < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - totalPoints);
        }
    }
}
