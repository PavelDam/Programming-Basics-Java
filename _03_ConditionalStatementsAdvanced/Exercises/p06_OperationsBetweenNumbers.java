package L03ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double sum = 0;

        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            switch (operator) {
                case "+":
                    sum = n1 + n2;
                    break;
                case "-":
                    sum = n1 - n2;
                    break;
                case "*":
                    sum = n1 * n2;
                    break;
            }
            if (sum % 2 == 0) {
                System.out.printf("%d %s %d = %.0f - even", n1, operator, n2, sum);
            } else {
                System.out.printf("%d %s %d = %.0f - odd", n1, operator, n2, sum);
            }

        } else if (operator.equals("/") && n2 != 0) {
            sum = (1.0 * n1 / n2);
            System.out.printf("%d %s %d = %.2f", n1, operator, n2, sum);

        } else if (operator.equals("%") && n2 != 0) {
            sum = n1 % n2;
            System.out.printf("%d %s %d = %.0f", n1, operator, n2, sum);
        }
        if ((n2 == 0) && operator.equals("/") || operator.equals("%") && n2 ==0) {
            System.out.printf("Cannot divide %d by zero", n1);
        }
    }
}
