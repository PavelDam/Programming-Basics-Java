package Exam18and19July2020;

import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());


        int s1, s2, s3, s4;

        s4 = start % 10;
        start /= 10;
        s3 = start % 10;
        start /= 10;
        s2 = start % 10;
        start /= 10;
        s1 = start % 10;

        int e1, e2, e3, e4;

        e4 = end % 10;
        end /= 10;
        e3 = end % 10;
        end /= 10;
        e2 = end % 10;
        end /= 10;
        e1 = end % 10;

        for (int i = s1; i <= e1; i++) {
            for (int j = s2; j <= e2; j++) {
                for (int k = s3; k <= e3; k++) {
                    for (int l = s4; l <= e4; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
