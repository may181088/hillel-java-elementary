package ua.od.hillel;
/*
компиляция
javac src\ua\od\hillel\Main.java -d out

запуск (с указанием параметров в формате "число действие число"
java -cp out ua.od.hillel.Main 10 addition 5

 */

public class Main {

    public static void main(String[] args) {
        double firstNumber = Double.parseDouble(args[0]);
        String operation = args[1];
        double secondNumber = Double.parseDouble(args[2]);
        double result = 0;

        if (operation.equals("addition")){
            result = addAB(firstNumber, secondNumber);
            System.out.println("The result of "+operation+" between "+firstNumber+" and "+secondNumber+" is "+result);
        }
        else if (operation.equals("subtraction")){
            result = subtractAB(firstNumber, secondNumber);
            System.out.println("The result of "+operation+" between "+firstNumber+" and "+secondNumber+" is "+result);
        }
        else if (operation.equals("multiplication")){
            result = multiAB(firstNumber, secondNumber);
            System.out.println("The result of "+operation+" between "+firstNumber+" and "+secondNumber+" is "+result);
        }
        else if (operation.equals("division")){
            result = divAB(firstNumber, secondNumber);
            System.out.println("The result of "+operation+" between "+firstNumber+" and "+secondNumber+" is "+result);
        }
        else if (operation.equals("remainder")){
            result = remainOfTheDivAB(firstNumber, secondNumber);
            System.out.println("The result of "+operation+" between "+firstNumber+" and "+secondNumber+" is "+result);
        }
        else if (operation.equals("absolute")){
            result = absValN(firstNumber);
            System.out.println("The absolute value of "+firstNumber+" is "+result);
            result = absValN(secondNumber);
            System.out.println("The absolute value of "+secondNumber+" is "+result);
        }
        else System.out.println("Wrong data!!!");
    }

    public static double addAB(double a, double b) {
        // addition
        return a+b;
    }

    public static double subtractAB(double a, double b) {
        //  subtraction
        return a-b;
    }

    public static double multiAB(double a, double b) {
        //    multiplication
        return a*b;
    }

    public static double divAB(double a, double b) {
        //            division
        return a/b;
    }

    public static double remainOfTheDivAB(double a, double b) {
        //    remainder of the division
        return a%b;
    }

    public static double absValN(double N) {
        //    finding the absolute value
        return Math.abs(N);
    }
}
