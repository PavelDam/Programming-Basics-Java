package L03ConditionalStatementsAdvanced.Bonus;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String type = "";
        String vehicleClass = "";
        double price = 0;
        if (budget<=100){
            vehicleClass = "Economy class";
            switch (season){
                case "Summer":
                    type = "Cabrio";
                    price = budget * 0.35;
                    break;
                case "Winter":
                    type = "Jeep";
                    price = budget * 0.65;
                    break;
            }
        }else if (budget >100 && budget <=500){
            vehicleClass = "Compact class";
            switch (season){
                case "Summer":
                    type = "Cabrio";
                    price = budget * 0.45;
                    break;
                case "Winter":
                    type = "Jeep";
                    price = budget * 0.80;
                    break;
            }
        }else {
            vehicleClass = "Luxury class";
            type = "Jeep";
            price = budget * 0.90;
        }
        System.out.printf("%s%n",vehicleClass);
        System.out.printf("%s - %.2f",type, price);
    }
}
//•	Първи ред – "{Вид на класа}"
//o	"Economy class", "Compact class" или "Luxury class"
//•	Втори ред – "{Вид на колата} - {цена на колата}"
//o	Видът на колата – "Cabrio" или "Jeep"
//o	Цената трябва да е форматирана до втория знак след запетаята