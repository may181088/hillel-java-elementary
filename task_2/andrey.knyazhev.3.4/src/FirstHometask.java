import java.util.Scanner;

public class FirstHometask {
    /**
     * Main method
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers to find minimal: ");
    minimalNum(scan.nextInt(), scan.nextInt(), scan.nextInt());
        System.out.println("Enter 3 numbers to find minimal and maximum: ");
     minAndMaxNum(scan.nextInt(), scan.nextInt(), scan.nextInt());
        System.out.println("Enter 3 numbers to find any minimal: ");
     anyMinNum(scan.nextInt(), scan.nextInt(), scan.nextInt());
        System.out.println("Enter number to check even/odd: ");
     evenOdd(scan.nextInt());
        System.out.println("Enter 2 numbers to check divine with/without modulo: ");
        modulo(scan.nextInt(), scan.nextInt());
        System.out.println("Enter 2 numbers to find the nearest number to 10: ");
        nearestNum(scan.nextInt(), scan.nextInt());
        System.out.println("How many days did you live here?");
        roomRent(scan.nextInt());
    }

    /**
     * 1) Найти минимальное из 3х чисел
     */
    public static void minimalNum(int x, int y, int z){

        System.out.println("You entered " + x + ", " + y + ", " + z);
        System.out.println("Minimal number is " + ((x < y) ? ((x < z) ? x : z) : ((y < z) ? y : z)));
    }

    /**
     * Найти среди 3х чисел максимальное и минимальное
     */
    public static void minAndMaxNum(int x, int y, int z){
        System.out.println("You entered " + x + ", " + y + ", " + z);
        System.out.println("Minimal number is " + ((x < y) ? ((x < z) ? x : z) : ((y < z) ? y : z)));
        System.out.println("Maximum number is " + ((x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z)));
    }

    /**
     * 3) Найти минимальное из 3х чисел, причем, если минимальных несколько, вывести все такие числа
     */
    public static void anyMinNum(int x, int y, int z){
        System.out.println("You entered " + x + ", " + y + ", " + z);
        if (x < y && x < z)
            System.out.println("Minimal num is " + x);
        if (z < x && z < y)
            System.out.println("Minimal num is " + z);
        if (y < x && y < z)
            System.out.println("Minimal num is " + y);
        if (x == y && x < z)
            System.out.println("Minimal numbers are " + x + ", " + y);
        if (x == z && x < y)
            System.out.println("Minimal numbers are " + x + ", " + z);
        if (z == y && z < x)
            System.out.println("Minimal numbers are " + z + ", " + y);
        if (x == y && x == z)
            System.out.println("Same numbers");

    }

    /**
     * 4) Написать программу, которая проверит, является ли число четным или нечетным
     */
    public static void evenOdd(int x){
      if (x % 2 == 0)
          System.out.println(x + " is even");
      else
          System.out.println(x + " is odd");
    }

    /**
     * 5) Даны 2 числа, определить делится ли первое число на второе без остатка
     */
    public static void modulo(int x, int y){
        System.out.println("You entered " + x + ", " + y);
        if (x % y == 0)
            System.out.println("Divine without modulo");
        else
            System.out.println("Divine with modulo");
    }

    /**
     * 6) Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11
     */
    public static void nearestNum(int x, int y){
        System.out.println("You entered " + x + ", " + y);
        if (Math.abs(x - 10) < Math.abs(y - 10))
            System.out.println("The nearest number to 10 is " + x);
        else if (Math.abs(x - 10) > Math.abs(y - 10))
            System.out.println("The nearest number to 10 is " + y);
        else
            System.out.println("Distance between numbers are similar");
    }

    /**
     * 7) Посчитайте, сколько будет стоить аренда квартиры за заданное число дней, если известно,
     * что за 1 день ее стоимость 40 грн. Причем, если съемщик прожил в ней больше 5 дней, он
     * получит скидку 20 грн, а если больше 7 дней, то скидка составит 50 грн.
     */
    public static void roomRent(int time) {
        if (time >= 1)
            System.out.println("You lived here for " + time + " days");
        else {
            System.out.println("You didn't live here");
            return;
        }
        int price;
            if (time > 1 && time <= 5) {
                price = time * 40;
                System.out.println("Your rent costs " + price + " UAH");
            }
            else if (time > 5 && time <= 7){
                price = time * 40 - 20;
                    System.out.println("Your rent costs " + price + " UAH," + "You have -20 UAH discount" );
            }
            else {
                price = time * 40 - 50;
                System.out.println("Your rent costs " + price + " UAH," + "You have -50 UAH discount" );
            }
    }
}