package ua.od.hillel;

import java.util.Scanner;

/*
Создайте калькулятор, который выполняет, базовые арифметические операции:
- умножение;
- деление;
- сложение;
- вычитание;
- остаток от деления (%);
- нахождение модуля числа (можно использовать Math.abs)
входные данные здесь можно представить как:
String operation = "addition";
int firstOperand = 15;
int secondOperand = 12;
 */
public class Main {

    public static void main(String[] args) {
        boolean f=true;
        double a, b;
         char [] ch ;
         String str;
      Scanner sc = new Scanner(System.in);

      while(f==true) {
          System.out.println("Input first number,(Ener)" +
                  "\nnext input action,(Ener) : -, + , /, *, %    , $-exit" +
                  "\nInput second number,(Ener) ");


          a = sc.nextDouble();

          str = sc.next();

          b = sc.nextDouble();
          //System.out.println("Input select an action ");
          ch = new char[str.length()];
          for (int i = 0; i < str.length(); i++) {
              ch[i] = str.charAt(i);

          }

          switch (ch[0]) {
              case '-': {
                  System.out.println("= " + subtraction(a, b));
                  break;
              }
              case '+': {
                  System.out.println("= " + addition(a, b));
                  break;
              }
              case '/': {
                  System.out.println("= " + division(a, b));
                  break;
              }
              case '*': {
                  System.out.println("= " + multiplication(a, b));
                  break;
              }
              case '%': {
                  System.out.println("= " + divisionByModulus(a, b));
                  break;
              }
              case '$':{
                  f=false;
                  break;
              }
              default:
                  System.out.println("Input first number,(Ener)" +
                          "\nnext input action,(Ener): -, + , /, *, %,   $ -exit" +
                          "\nInput second number,(Ener) ");
          }


      }


    }
    static double addition (double a, double b){
        return a+b;
    }

    static double subtraction (double a, double b){
        return a-b;
    }

    static double division(double a, double b){return a/b;}

    static double multiplication(double a, double b){
        return a*b;
    }

    static double divisionByModulus(double a, double b){
        return a%b;
    }

















}
