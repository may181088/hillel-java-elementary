package hillel.od.ua;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
calculator();
    }
    public static void calculator(){
        String operation;
        double n1, n2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter operation you need (+, -, *, /, % or abs): ");
        operation = scan.nextLine();
        System.out.println("Enter first number: ");
        n1 = scan.nextDouble();
        System.out.println("Enter second number: ");
        n2 = scan.nextDouble();
        System.out.print("Result = ");
        switch (operation){
            case "+": System.out.print(plus(n1, n2));
            break;
            case "-": System.out.print(minus(n1, n2));
            break;
            case "*": System.out.print(multiply(n1, n2));
            break;
            case "/": System.out.print(divide(n1, n2));
            break;
            case "%": System.out.print(modulo(n1, n2));
            break;
            case "abs": System.out.print(absolute(n1));
        }
    }
    public static double plus(double x, double y){
        double sum = x + y;
        return sum;
    }
    public static double minus(double x, double y){
        double dif = x - y;
        return dif;
    }
    public static double multiply(double x, double y){
        double mult = x * y;
        return mult;
    }
    public static double divide(double x, double y){
        double div = x / y;
        return div;
    }
    public static double modulo(double x, double y){
        double mod = x % y;
        return mod;
    }
    public static double absolute(double x){
        double absnum = Math.abs(x);
        return absnum;
    }
}
