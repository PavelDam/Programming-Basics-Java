package Exam6And7July2019;

import java.util.Scanner;

public class P06TheMostPowerfullWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int biggestPoints = Integer.MIN_VALUE;
        String winnerWord = "";

        while (!input.equals("End of words")) {
            String name = input;
            int nameLenght = name.length();

            int letterSum = 0;
            String s = "";

            for (int i = 0; i < nameLenght; i++) {
                char symbol = name.charAt(i);
                int ascii = (int) symbol;
                if (i == 0) {
                    s = "" + symbol;
                }
                letterSum += ascii;
            }
            switch (s) {
                case "a":
                case "A":
                case "e":
                case "E":
                case "i":
                case "I":
                case "o":
                case "O":
                case "u":
                case "U":
                case "y":
                case "Y":
                    letterSum = letterSum * nameLenght;
                    break;
                default:
                    letterSum = Math.floorDiv(letterSum, nameLenght);
                    break;
            }
            if (letterSum > biggestPoints) {
                biggestPoints = letterSum;
                winnerWord = name;
            }
            input = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %d", winnerWord, biggestPoints);
    }
}
