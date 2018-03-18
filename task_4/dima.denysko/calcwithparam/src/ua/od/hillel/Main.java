package ua.od.hillel;

public class Main {

    public static void main(String[] args) {
        double a = Double.parseDouble(args[1]);
        double b = Double.parseDouble(args[2]);
        String s = args[0];
        int res = 0;
            if (s.equals("addition")) {
                res = 1;
            } else if (s.equals("subtraction")) {
                res = 2;
            } else if (s.equals("multiplication")) {
                res = 3;
            } else if (s.equals("division")) {
                res = 4;
            } else if (s.equals("remainder")) {
                res = 5;
            } else if (s.equals("absolute number")) {
                res = 6;
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
