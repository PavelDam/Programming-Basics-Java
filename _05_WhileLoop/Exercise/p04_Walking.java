package L05WhileLoop.Exercise;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10000;
        int sumSteps = 0;

        while (sumSteps < goal) {
            String input = scanner.nextLine();

            if (input.equals("Going home")) {
                int wayHome = Integer.parseInt(scanner.nextLine());
                sumSteps = sumSteps + wayHome;
                break;
            }
            int steps = Integer.parseInt(input);
            sumSteps = sumSteps + steps;

        }
        if (sumSteps >= goal) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", (sumSteps - goal));
        } else {
            System.out.printf("%d more steps to reach goal.", (goal - sumSteps));
        }
    }
}
