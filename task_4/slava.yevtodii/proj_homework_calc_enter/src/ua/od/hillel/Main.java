package ua.od.hillel;

import java.util.Scanner; // импорт сканера

public class Main {

    public static void main(String[] args) {
        double firstNumber = 0;
        double secondNumber = 0;
        double result = 0;
        double userResult = 0;

        int choice = 0;
        boolean check = true;

        Scanner scan = new Scanner(System.in);
        Scanner scanUserTry = new Scanner(System.in);

        System.out.println("Hey man! How about some math?");
        System.out.println("You need to tell me two numbers and the operation I should do with them. Simple, right?");
        System.out.println("So, let's start! Look at the list of operations!");
        System.out.println("1) Addition (2 numbers)\n2) Subtraction (2 numbers)\n3) Multiplication (2 numbers)" +
                "\n4) Division (2 numbers)\n5) Getting the remainder of the division (2 numbers)\n" +
                "6) Finding the absolute value (1 number)");
        System.out.println("Please make your choice of operation you wanna do? [1..6]");

        while (check) {
            choice = scan.nextInt();
            if (choice>0&&choice<=6) {
                check = false;
                if (choice==6) {
                    System.out.println("Great choice!\nEnter your number:");
                    firstNumber = scan.nextDouble();
                    System.out.println("Your number is "+firstNumber+".");
                }
                else {
                    System.out.println("Great choice!\nEnter your first number:");
                    firstNumber = scan.nextDouble();
                    System.out.println("Enter your second number:");
                    secondNumber = scan.nextDouble();
                    System.out.println("Your first number is "+firstNumber+" and your second number is "+secondNumber+".");
                }
            }
            else System.out.println("Error! Repeat please! You need to enter number from [1..6]");
        }

        System.out.print("We gonna make the operation of ");
        switch (choice) {
            case 1:
                System.out.println("addition.");
                result = addAB(firstNumber, secondNumber);
                break;
            case 2:
                System.out.println("subtraction.");
                result = subtractAB(firstNumber, secondNumber);
                break;
            case 3:
                System.out.println("multiplication.");
                result = multiAB(firstNumber, secondNumber);
                break;
            case 4:
                System.out.println("division.");
                result = divAB(firstNumber, secondNumber);
                break;
            case 5:
                System.out.println("getting the remainder of the division.");
                result = remainOfTheDivAB(firstNumber, secondNumber);
                break;
            case 6:
                System.out.println("getting the absolute value.");
                result = absValN(firstNumber);
                break;
        }

        check = true;
        System.out.println("You can check yourself, wanna try? [y,n]");
        while (check) {
            String yesNo = scanUserTry.nextLine();
            if (yesNo.equals("y")) {
                check = false;
                System.out.println("Great! What is your result?");
                userResult = scan.nextDouble();
                if (userResult==result) {
                    System.out.println("Wow, it's fantastic! Your answer is right. The result  is "+result+". Congratulations!");
                }
                else System.out.println("Sorry, man, but your answer "+userResult+" is wrong. The right answer is "+result+". Try again!");
            }
            else if (yesNo.equals("n")) {
                check = false;
                System.out.println("Damn, you are so lazy!\nThe result is "+result+".");
            }
            else System.out.println("Yes or no, man?!");
        }
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
