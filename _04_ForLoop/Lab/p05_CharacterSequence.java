package L04ForLoop.Lab;

import java.util.Scanner;

public class P05CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int lenghtText = text.length();

        for (int i = 0; i < lenghtText; i++){
            char symbol = text.charAt(i);
            System.out.println(symbol);
        }
    }
}
