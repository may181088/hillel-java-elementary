package ua.od.hillel;

import java.util.Scanner;

public class Tip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money;

        do {
            System.out.println("Enter money:");
            money = scanner.nextDouble();
        } while (money <= 0);

        int service_tip;
        //you need to add a restriction:
        // use only int, but I do not know how yet
        do {
            System.out.println("Choose the level of service (% tip):\n" +
                    "1. Terrible (0%)\n" +
                    "2. Poor (5%)\n" +
                    "3. Good (10%)\n" +
                    "4. Great (15%)\n" +
                    "5. Excellent (20%)");
            service_tip = scanner.nextInt();
        } while (service_tip <= 0 || service_tip >= 6);

        System.out.println("You mast pay: " + totalMoney(money, service_tip));
    }

    private static double totalMoney(double money, int service_tip) {
        switch (service_tip) {
            case 1: // Terrible
                return money;
            case 2: // Poor
                return money * 1.05;
            case 3: // Good
                return money * 1.1;
            case 4: // Great
                return money * 1.15;
            case 5: // Excellent
                return money * 1.2;
        }
        return money;
    }
}