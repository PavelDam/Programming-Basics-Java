package L04ForLoop.Lab;

import java.util.Scanner;

public class P06VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int lenghtText = text.length();

        int sum = 0;
        for (int i = 0; i < lenghtText; i++) {
            char symbol = text.charAt(i);


            switch (symbol) {
                case 'a':
                    sum = sum + 1;
                    break;
                case 'e':
                    sum = sum + 2;
                    break;
                case 'i':
                    sum = sum + 3;
                    break;
                case 'o':
                    sum = sum + 4;
                    break;
                case 'u':
                    sum = sum + 5;
                    break;
            }

        }
        System.out.println(sum);
    }
}
