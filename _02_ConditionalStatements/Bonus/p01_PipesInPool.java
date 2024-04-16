package L02ConditionalStatements.Bonus;

import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double vP1 = p1 * h;
        double vP2 = p2 * h;
        double vP1P2 = vP1 + vP2;
        double percent = vP1P2 / v * 100;
        double percentP1 = vP1 / vP1P2 * 100;
        double percentP2 = vP2 / vP1P2 * 100;

        if (vP1P2 <= v) {
            System.out.printf("The pool is %.2f%c full. Pipe 1: %.2f%c. Pipe 2: %.2f%c.", percent, '%', percentP1, '%', percentP2, '%');
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, vP1P2 - v);
        }

    }

}
//•	До колко се е запълнил басейна и коя тръба с колко процента е допринесла.
//o	"The pool is {запълненост на басейна в проценти}% full. Pipe 1: {процент вода от първата тръба}%. Pipe 2: {процент вода от втората тръба}%."
//Aко басейнът се е препълнил – с колко литра е прелял за даденото време.
//o	"For {часовете, които тръбите са пълнили вода} hours the pool overflows with {литрите вода в повече} liters."