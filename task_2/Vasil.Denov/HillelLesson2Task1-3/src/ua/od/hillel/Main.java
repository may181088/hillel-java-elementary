package ua.od.hillel;

import java.util.Scanner;


/**
 * @author Vasya
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: \na = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();


        if (a == b && b == c) {
            System.out.println("values are equal");
        } else {
            System.out.print("Min: " + min(a, b, c));

            if (twinNumber(a, b, c) == min(a, b, c))
                System.out.print(" " + min(a, b, c));
        }

        System.out.println();
        System.out.println("Max: " + max(a, b, c));
    }

    // метод возвращяет значение одинакового числа

    /**
     *
     * @param a  чило введеное пользователем
     * @param b  чило введеное пользователем
     * @param c  чило введеное пользователем
     * @return значение  одинаковых чисел
     */
    static int twinNumber(int a, int b, int c) {

        if (a == b | a == c) return a;
        else if (b == c) return c;
        else return 0;

    }

    /**
     *
     * @param num1
     * @param num2
     * @param num3
     * @return минимальное число
     */
    static int min(int num1, int num2, int num3) {

        if (num1 < num2 && num1 < num3) return num1;
        else if (num2 < num3) return num2;
        else return num3;

    }

    /**
     *
     * @param num1
     * @param num2
     * @param num3
     * @return максимальное число
     */
    static int max(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) return num1;
        else if (num2 > num3) return num2;
        else return num3;

    }
}

