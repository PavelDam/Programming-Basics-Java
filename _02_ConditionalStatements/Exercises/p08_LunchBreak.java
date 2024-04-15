package L02ConditionalStatements.Exercises;

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double timeForLunch = breakDuration * 0.125;
        double timeForRelax = breakDuration * 0.25;
        double timeForSerial = breakDuration - timeForRelax - timeForLunch;

        if (timeForSerial >= episodeDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(timeForSerial - episodeDuration));

        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(episodeDuration - timeForSerial));
        }
    }
}
