package ua.od.hillel;

import java.util.Scanner;

public class Tips {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter payment amount:");
        double amount = scanner.nextDouble();

        System.out.println("Enter service level:");
        String lvlService = scanner.next();

        System.out.println("Payment amount including tips: " + calculate(amount,lvlService));

    }

    public static double calculate(double amount, String levelService) {
        switch (levelService) {
            case "terrible":
                break;
            case "poor":
                amount += amount*0.05;
                break;
            case "good":
                amount += amount*0.1;
                break;
            case "great":
                amount += amount*0.15;
                break;
            case "excellent":
                amount += amount*0.2;
                break;
        }
        return amount;
    }
}
