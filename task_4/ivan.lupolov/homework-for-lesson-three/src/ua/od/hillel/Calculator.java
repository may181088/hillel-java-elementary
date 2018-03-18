package ua.od.hillel;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        String command;
        double num1;
        double num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, pick mod of input. (Scanner (S) or command line arguments (C)): ");

        while(!(command = scanner.next()).equals("N")) {

            if (command.equals("S") || command.equals("Y")) { // блок для ввода данных через Scaner, после вывода результата есть возможность выполнять операции повторно
                System.out.println("=================================================\n" +
                        "Operation list:\n" +
                        "add - addition\n" +
                        "mult - multiplication\n" +
                        "sub - subtraction\n" +
                        "div - division\n" +
                        "mod - remainder of the division\n" +
                        "abs - absolute value\n" +
                        "=================================================");

                System.out.println("Enter operation: ");
                command = scanner.next();

                if (command.equals("abs")) {
                    System.out.println("Enter number: ");
                    num1 = scanner.nextDouble();
                    num2 = 0;
                } else {
                    System.out.println("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter second number: ");
                    num2 = scanner.nextDouble();
                }

                switch (command) {
                    case "add":
                        System.out.println("Result: " + addition(num1, num2));
                        System.out.println("\nDo you want to perform another operation? Y or N?");
                        break;
                    case "mult":
                        System.out.println("Result: " + multiplication(num1, num2));
                        System.out.println("\nDo you want to perform another operation? Y or N?");
                        break;
                    case "div":
                        System.out.println("Result: " + division(num1, num2));
                        System.out.println("\nDo you want to perform another operation? Y or N?");
                        break;
                    case "sub":
                        System.out.println("Result: " + subtraction(num1, num2));
                        System.out.println("\nDo you want to perform another operation? Y or N?");
                        break;
                    case "mod":
                        System.out.println("Result: " + mod(num1, num2));
                        System.out.println("\nDo you want to perform another operation? Y or N?");
                        break;
                    case "abs":
                        System.out.println("Result: " + abs(num1));
                        System.out.println("\nDo you want to perform another operation? Y or N?");
                        break;
                    default:
                        System.err.println("Wrong operation: " + command);
                        System.out.println("\nTry again? Y or N?");
                }
            } else if (command.equals("C")) { // блок для который считает данные из CLI, после вывода результата программа завершает работу

                command = args[0];
                if (command.equals("abs")) {
                    num1 = Double.parseDouble(args[1]);
                    num2 = 0;
                } else {
                    num1 = Double.parseDouble(args[1]);
                    num2 = Double.parseDouble(args[2]);
                }

                switch (command) {
                    case "add":
                        System.out.println("Input: " + num1 + ", " + num2 +"; Operation: " + command + " \nResult: " + addition(num1, num2));
                        return;
                    case "mult":
                        System.out.println("Input: " + num1 + ", " + num2 +"; Operation: " + command + " \nResult: " + multiplication(num1, num2));
                        return;
                    case "div":
                        System.out.println("Input: " + num1 + ", " + num2 +"; Operation: " + command + " \nResult: " + division(num1, num2));
                        return;
                    case "sub":
                        System.out.println("Input: " + num1 + ", " + num2 +"; Operation: " + command + " \nResult: " + subtraction(num1, num2));
                        return;
                    case "mod":
                        System.out.println("Input: " + num1 + ", " + num2 +"; Operation: " + command + " \nResult: " + mod(num1, num2));
                        return;
                    case "abs":
                        System.out.println("Input: " + num1 + "; Operation: " + command + " \nResult: " + abs(num1));
                        return;
                    default:
                        System.err.println("Wrong operation: " + args[0]);
                        return;
                }

            } else {
                System.err.println("Wrong mod. Please enter (S) or (C).");
            }
        }

    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double mod(double num1, double num2) {
        return num1 % num2;
    }

    public static double abs(double num) {
        return  (num >= 0) ? num : 0 - num;
    }
}
