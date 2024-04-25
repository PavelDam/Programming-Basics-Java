package L05WhileLoop.Lab;

import java.util.Scanner;

public class P04Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int firstNum = 1;

        while (firstNum <= n) {
            System.out.println(firstNum);

            firstNum = firstNum * 2 + 1;
        }
    }
}
