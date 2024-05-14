package Exam18and19July2020;

import java.util.Scanner;

public class P05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String bestPlayer = "";
        int maxGoals = Integer.MIN_VALUE;
        while (!name.equals("END")){
            int goals = Integer.parseInt(scanner.nextLine());

            if (goals > maxGoals){
                maxGoals = goals;
                bestPlayer = name;
            }
            if (maxGoals >=10){
                break;
            }
            name = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n",bestPlayer);
        if (maxGoals >=3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!",maxGoals);
        } else {
            System.out.printf("He has scored %d goals.",maxGoals);
        }
    }
}
