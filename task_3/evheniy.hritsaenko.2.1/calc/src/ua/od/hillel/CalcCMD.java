package ua.od.hillel;

public class CalcCMD {

    public static void main(String[] args) {
        int num_oper = Integer.parseInt(args[0]);
        double accep_1st = Double.parseDouble(args[1]);
        double accep_2 = Double.parseDouble(args[2]);

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