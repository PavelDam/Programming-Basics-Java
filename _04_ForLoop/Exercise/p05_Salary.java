package L04ForLoop.Exercises;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	"Facebook" -> 150 лв.
        //•	"Instagram" -> 100 лв.
        //•	"Reddit" -> 50 лв.
        int openTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int forfeit = 0;
        for (int i = 1; i <= openTabs; i++) {
            String name = scanner.nextLine();
            switch (name) {
                case "Facebook":
                    forfeit += 150;
                    break;
                case "Instagram":
                    forfeit += 100;
                    break;
                case "Reddit":
                    forfeit += 50;
                    break;
            }
            if (salary <= forfeit) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > forfeit) {
            System.out.println(salary - forfeit);
        }
    }
}
