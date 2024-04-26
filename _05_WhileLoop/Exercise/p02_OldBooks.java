package L05WhileLoop.Exercise;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        String name = scanner.nextLine();
        int chekedBooks = 0;

        while (!name.equals("No More Books")) {
            if (bookName.equals(name)) {
                break;
            }
            chekedBooks++;

            name = scanner.nextLine();
        }
        if (name.equals("No More Books")) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", chekedBooks);
        } else {
            System.out.printf("You checked %d books and found it.", chekedBooks);
        }
    }
}
