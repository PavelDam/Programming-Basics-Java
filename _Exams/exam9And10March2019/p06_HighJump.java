package Exam9And10March2019;

import java.util.Scanner;

public class P06HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededHigh = Integer.parseInt(scanner.nextLine());
        int actualJump = 0;
        int countJump = 0;
        int unSuccsesJump = 0;
        int stickHigh = 0;

        while (true) {

            for (int i = neededHigh - 30; i <= neededHigh; i += 5) {
                int jump = Integer.parseInt(scanner.nextLine());
                stickHigh = i;
                if (i < jump) {
                    countJump++;
                    actualJump = jump;
                    unSuccsesJump = 0;
                } else {
                unSuccsesJump++;
                countJump++;
                i -=5;
                }
                if (unSuccsesJump==3){
                    break;
                }
            }
            if (unSuccsesJump==3){
                System.out.printf("Tihomir failed at %dcm after %d jumps.",stickHigh,countJump);
                break;
            }
            if (actualJump>neededHigh){
                System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.",stickHigh,countJump);
                break;
            }
        }
    }
}
