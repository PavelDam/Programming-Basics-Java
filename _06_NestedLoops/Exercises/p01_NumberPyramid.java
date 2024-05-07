package L06NestedLoops.Exercises;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int currentNum = 1;
        for (int rows = 1; rows <= num; rows++) {
            for (int collums = 1; collums <= rows; collums++) {
                System.out.print(currentNum + " ");
                currentNum++;

                if (currentNum > num) {
                    break;
                }
            }
            if (currentNum > num) {
                break;
            }
            System.out.println();
        }
    }
}
