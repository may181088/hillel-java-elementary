
/**
 * Lesson2
 */
public class Lesson2 {
    /**
     * Main
     */
    public static void main(String[] args) {
        minOfThreeNumbers(3, 2, 4);
        minAndMaxOfThreeNumbers(3, 2, 4);
        minOfThreeNumbers2(3, 3, 3);
        System.out.println(checkEven(3));
        System.out.println(divisionWithoutResidue(4, 2));
        System.out.println("closest number: " + closest(9, 12));
        lease(8);
    }

    /**
     * 1) Найти минимальное из 3х чисел
     */
    public static void minOfThreeNumbers(int n1, int n2, int n3) {
        int min;
        if (n1 < n2 && n1 < n3) min = n1;
        else if (n2 < n1 && n2 < n3) min = n2;
        else min = n3;
        System.out.println("min: " + min + " from: " + n1 + ", " + n2 + " ," + n3);
    }

    /**
     * 2)Найти среди 3х чисел максимальное и минимальное
     */
    public static void minAndMaxOfThreeNumbers(int n1, int n2, int n3) {
        int min, max;
        if (n1 < n2 && n1 < n3) {
            min = n1;
            max = Math.max(n2, n3);
        } else if (n2 < n1 && n2 < n3) {
            min = n2;
            max = Math.max(n1, n3);
        } else {
            min = n3;
            max = Math.max(n1, n2);
        }

        System.out.println("min: " + min + " max: " + max + " from: " + n1 + ", " + n2 + " ," + n3);
    }

    /**
     * 3) Найти минимальное из 3х чисел, причем, если минимальных несколько вывести все такие числа
     */
    public static void minOfThreeNumbers2(int n1, int n2, int n3) {
        if (n1 == n2 && n1 == n3) {
            System.out.println("all numbers == " + n1 + ", " + n2 + " ," + n3);
            return;
        }
        if (n1 < n2 && n1 < n3) System.out.println("min: " + n1);
        else if (n2 < n1 && n2 < n3) System.out.println("min: " + n2);
        else if (n3 < n1 && n3 < n2) System.out.println("min: " + n3);
        else if (n1 == n2) System.out.println("min 2 numbers " + n1 + ", " + n2);
        else if (n2 == n3) System.out.println("min 2 numbers " + n2 + ", " + n3);
        else System.out.println("min 2 numbers " + n1 + ", " + n3);
    }

    /**
     * 4) Написать программу, которая проверит, является ли число четным или нечетным
     */
    public static boolean checkEven(int a) {
        if (a % 2 == 0) return true;
        else return false;
    }

    /**
     * 5) Даны 2 числа, определить делится ли первое число на второе без остатка
     */
    public static boolean divisionWithoutResidue(int a, int b) {
        if (a % b == 0) return true;
        else return false;
    }

    /**
     * 6) Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11
     */
    public static int closest(int a, int b) {
        int point = 10;
        if (Math.abs(a - point) < Math.abs(b - point)) {
            return a;
        }
        return b;
    }

    /**
     * 7) Посчитайте, сколько будет стоить аренда квартиры за заданное число дней, если известно,
     * что за 1 день ее стоимость 40 грн. Причем, если съемщик прожил в ней больше 5 дней, он получит скидку 20 грн,
     * а если больше 7 дней, то скидка составит 50 грн.
     */
    public static void lease(int a) {
        int oneDay = 40;
        int res = 0;
        for (int i = 0; i < a; i++) {
            res += oneDay;
        }
        if (a > 5 && a <= 7) System.out.println("Total: " + (res - 20));
        else if (a > 7) System.out.println("Total: " + (res - 50));
        else System.out.println("Total: " + res);
    }

}
