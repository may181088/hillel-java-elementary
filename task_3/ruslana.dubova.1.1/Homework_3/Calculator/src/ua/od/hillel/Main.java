package ua.od.hillel;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here

        Calculator calc = new Calculator();

        if (args.length == 0) {

            Scanner scr = new Scanner(System.in);

            System.out.println("Specify opreation: ");
            String operation = scr.nextLine().trim();

            System.out.println("Specify first operand: ");
            int firstOperand = scr.nextInt();

            System.out.println("Specify second operand: ");
            int secondOperand = scr.nextInt();

            System.out.println("Result: " + calc.compute(operation, firstOperand, secondOperand));

        }else if(args.length==3){
            String operation = args[0];
            int firstOperand = Integer.parseInt(args[1]);
            int secondOperand = Integer.parseInt(args[2]);

            System.out.println("trying to parse commandline arguments: operation=" + operation +
                               " firstOperand=" + firstOperand +
                               " secondOperand=" + secondOperand);

            System.out.println("Result: " + calc.compute(operation, firstOperand, secondOperand));
        }

    }
}
