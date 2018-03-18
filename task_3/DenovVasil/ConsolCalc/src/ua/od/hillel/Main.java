package ua.od.hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int key = 0, key2 = 0;     //для хранения ключа
        char[] action;
        char[] arr1, arr2;    // для хранения массива чаров
        double[] ArrayOfNumber1, ArrayOfNumber2;
        double a = 0, fa = 0, num1 = 0, num2 = 0;
        double a2 = 0, fa2 = 0;
        boolean fraction1 = false, fraction2 = false;

        arr1 = CharArray(args[0]); //для первого числа
        action = CharArray(args[1]);  // action [0] for switch
        arr2 = CharArray(args[2]);

        ArrayOfNumber1 = convertCharToDouble(arr1);
        ArrayOfNumber2 = convertCharToDouble(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == ',') {
                fraction1 = true;
                key = i;
            }

        }


        //проверка
        if (fraction1 == false) {
            num1 = considerIntPart(ArrayOfNumber1, ArrayOfNumber1.length);


        } else {
            a = considerIntPart(ArrayOfNumber1, key);
            fa = considerDoublePart(ArrayOfNumber1, key + 1);
            num1 = a + fa;

        }
        System.out.println("число = " + num1);
        // делаем все тоже самое для второго числа
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == ',') {
                fraction2 = true;
                key2 = i;
            }
        }
        if (fraction2 == false) {
            num2 = considerIntPart(ArrayOfNumber2, ArrayOfNumber2.length);


        } else {
            a2 = considerIntPart(ArrayOfNumber2, key2);
            fa2 = considerDoublePart(ArrayOfNumber2, key2 + 1);
            num2 = a2 + fa2;

        }
        System.out.println("второе число = " + num2);
        System.out.println("Action= " + action[0]);

        switch (action[0]) {
            case '-': {
                System.out.println("= " + subtraction(num1, num2));
                break;
            }
            case '+': {
                System.out.println("= " + addition(num1, num2));
                break;
            }
            case '/': {
                System.out.println("= " + division(num1, num2));
                break;
            }
            case '*': {
                System.out.println("= " + multiplication(num1, num2));
                break;
            }
            case '%': {
                System.out.println("= " + divisionByModulus(num1, num2));
                break;
            }

            default:
                break;
        }


    }


    //метод для получения массива типа Char из строки
    static char[] CharArray(String str) {
        char ch[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);

        }
        return ch;
    }


    //convert char array to тип number
    static double[] convertCharToDouble(char[] ch) {

        double[] array = new double[ch.length];
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 48) array[i] = 0;
            if (ch[i] == 49) array[i] = 1;
            if (ch[i] == 50) array[i] = 2;
            if (ch[i] == 51) array[i] = 3;
            if (ch[i] == 52) array[i] = 4;
            if (ch[i] == 53) array[i] = 5;
            if (ch[i] == 54) array[i] = 6;
            if (ch[i] == 55) array[i] = 7;
            if (ch[i] == 56) array[i] = 8;
            if (ch[i] == 57) array[i] = 9;

        }
        return array;
    }

    //метод для формирования целой части числа
    static double considerIntPart(double arr[], int length) {
        double num = 0, sum = 0;
        int k = 0;
        for (int i = 0; i < length; i++) {
            k = length - i - 1;
            num = arr[i] * Math.pow(10, k);
            sum += num;
            //System.out.println(num);

        }
        return sum;
    }

    // метод для формирования дробной части числа
    static double considerDoublePart(double arr[], int start) {
        double num = 0, sum = 0;
        int k = 0;
        for (int i = start; i < arr.length; i++) {
            num = arr[i] * Math.pow(10, -(++k));
            sum += num;
        }
        return sum;
    }


    static double addition(double a, double b) {
        return a + b;
    }

    static double subtraction(double a, double b) {
        return a - b;
    }

    static double division(double a, double b) {
        return a / b;
    }

    static double multiplication(double a, double b) {
        return a * b;
    }

    static double divisionByModulus(double a, double b) {
        return a % b;
    }

    }
