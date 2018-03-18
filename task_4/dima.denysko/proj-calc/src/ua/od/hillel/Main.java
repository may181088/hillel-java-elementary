package ua.od.hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a = 0, b = 0;
        System.out.println("Enter operation");
        System.out.println("addition subtraction multiplication division remainder or absolute number");
        System.out.print(">>>>>");
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int res = 0;
        while (flag) {
            String s = scanner.nextLine();
            if (s.equals("addition")) {
                res = 1;
                flag = false;
            } else if (s.equals("subtraction")) {
                res = 2;
                flag = false;
            } else if (s.equals("multiplication")) {
                res = 3;
                flag = false;
            } else if (s.equals("division")) {
                res = 4;
                flag = false;
            } else if (s.equals("remainder")) {
                res = 5;
                flag = false;
            } else if (s.equals("absolute number")) {
                res = 6;
                flag = false;
            } else {
                System.out.println("Enter operation");
                System.out.println("addition subtraction multiplication division remainder or absolute number");
                System.out.print(">>>>>");
            }
        }
        if (res < 6 && res > 0) {
            System.out.print("Enter First Number>>>");
            a = scanner.nextDouble();
            System.out.print("Enter Second Number>>>");
            b = scanner.nextDouble();
        } else {
            System.out.print("Enter Number>>>");
            a = scanner.nextDouble();
        }
        switch (res) {
            case 1:
                System.out.println("Result of addition: " + addition(a, b));
                break;
            case 2:
                System.out.println("Result of subtraction: " + subtraction(a, b));
                break;
            case 3:
                System.out.println("Result of multiplication: " + multiplication(a, b));
                break;
            case 4:
                System.out.println("Result of division: " + division(a, b));
                break;
            case 5:
                System.out.println("Result of remainder: " + remainderOfTheDivision(a, b));
                break;
            case 6:
                System.out.println("Absolute number: " + absoluteNumber(a));
                break;
        }
        System.out.println("Have a nice day");
    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double remainderOfTheDivision(double a, double b) {
        return a % b;
    }

    public static double absoluteNumber(double a) {
        return Math.abs(a);
    }
}
