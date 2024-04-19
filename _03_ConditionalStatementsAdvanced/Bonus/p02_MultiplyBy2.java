package L03ConditionalStatementsAdvanced.Bonus;

import java.util.Scanner;

public class P02MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());


        for (double i = number;i > 0;i= i*2){

            System.out.println(i);
        }
    }
}
