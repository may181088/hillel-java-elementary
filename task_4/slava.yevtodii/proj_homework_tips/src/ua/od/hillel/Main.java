package ua.od.hillel;

import java.util.Scanner; // импорт сканера

public class Main {

    public static void main(String[] args) {
        double cash = 0;
        double resultCash = 0;
        int choice = 0;
        boolean check = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("Hey man! I can help you to calculate how much money you should leave in restaurant.");
        System.out.println("What is the cash number in your bill?");

        while (check) {
            cash = scan.nextDouble();
            if (cash >= 0) {
                check = false;
            } else System.out.println("Error! Cash can not be negative. Repeat please!");
        }

        System.out.println("The tips quantity depends on how you rate the service here:");
        System.out.println("1) Terrible (0%)\n2) Poor (5%)\n3) Good (10%)\n4) Great (15%)\n5) Excellent (20%)");
        System.out.println("So what is your rate? [1..5]");

        check = true;
        while (check) {
            choice = scan.nextInt();
            if (choice > 0 && choice < 6) {
                check = false;
            } else System.out.println("Error! Repeat please! You need to enter number from [1..5]");
        }

        System.out.print("Your bill is for " + cash + " UAH and you've rated the service as ");
        switch (choice) {
            case 1:
                System.out.print("terrible.");
                resultCash = cash;
                break;
            case 2:
                System.out.print("poor.");
                resultCash = cash * 1.05;
                break;
            case 3:
                System.out.print("good.");
                resultCash = cash * 1.1;
                break;
            case 4:
                System.out.print("great.");
                resultCash = cash * 1.15;
                break;
            case 5:
                System.out.print("excellent.");
                resultCash = cash * 1.2;
                break;
        }
        System.out.println(" I suggest you to pay" + String.format("%8.2f", resultCash) + " UAH.");
    }
}
