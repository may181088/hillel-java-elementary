package ua.od.hillel;

import java.util.Scanner;

public class CalcStandard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num_oper;
        //you need to add a restriction:
        // use only int, but I do not know how yet
        do {
            System.out.println("Enter number of the operation:\n" +
                    "1. multiplication.\n" +
                    "2. division.\n" +
                    "3. addition.\n" +
                    "4. subtraction.\n" +
                    "5. remainder of the division.\n" +
                    "6. absolute of a number.");
            num_oper = scanner.nextInt();
        } while (num_oper <= 0 || num_oper >= 7); //you need to add a restriction:
        // use only int, but I do not know how yet

        double accep_1st;
        double accep_2 = 0; //why it does not work without assignment
        if (num_oper == 6) {
            System.out.println("Enter number:");
            accep_1st = scanner.nextDouble();
        } else {
            System.out.println("Enter 1st number:");
            accep_1st = scanner.nextDouble();

            System.out.println("Enter 2 number:");
            accep_2 = scanner.nextDouble();
        }

        switch (num_oper) {
            case 1:
                System.out.println("Result of multiplication: " + multiplication(accep_1st, accep_2));
                break;
            case 2:
                System.out.println("Result of division: " + division(accep_1st, accep_2));
                break;
            case 3:
                System.out.println("Result of addition: " + addition(accep_1st, accep_2));
                break;
            case 4:
                System.out.println("Result of subtraction: " + subtraction(accep_1st, accep_2));
                break;
            case 5:
                System.out.println("Result remainder of the division: " + remainDivis(accep_1st, accep_2));
                break;
            case 6:
                System.out.println("Absolute number: " + abs(accep_1st));
                break;
        }
    }

    private static double multiplication(double a, double b) {
        return a * b;
    }

    private static double division(double a, double b) {
        return a / b;
    }

    private static double addition(double a, double b) {
        return a + b;
    }

    private static double subtraction(double a, double b) {
        return a - b;
    }

    private static double remainDivis(double a, double b) {
        return a % b;
    }

    private static double abs(double a) {
        return Math.abs(a);
    }
}