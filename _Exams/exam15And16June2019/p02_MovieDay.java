package Exam15And16June2019;

import java.util.Scanner;

public class P02MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeForPictures = Integer.parseInt(scanner.nextLine());
        int picturesCount = Integer.parseInt(scanner.nextLine());
        int duration = Integer.parseInt(scanner.nextLine());

        double preparing = timeForPictures * 0.15;

        int timeForFimling = picturesCount * duration;
        int totalTime = (int) (preparing + timeForFimling);

        if (timeForPictures >= totalTime) {
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!", timeForPictures - totalTime);
        } else {
            System.out.printf("Time is up! To complete the movie you need %d minutes.", totalTime - timeForPictures);
        }

    }
}
