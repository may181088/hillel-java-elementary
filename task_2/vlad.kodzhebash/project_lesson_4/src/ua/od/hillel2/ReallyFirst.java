package edu.kodzhebash.hillelLessons.Hillel2;

public class ReallyFirst {

    /**
     * main
     */

    public static void main(String[] args) {
        Min(5, 7, 2);
        MinAndMax(9, 2, 8);
        System.out.println("Task 4" + " - " + ChetNeChet(5));
        System.out.println("Task 5" + " - " + CheckingRemainderOfTheDivision(7, 2));
        Min2(2,3,3);
        ClosestNumber(7,11);
        HouseRenting( 6);

    }

    /**
     * Task 1
     * looking for min from numbers
     */
    public static void Min(int a, int b, int c) {
        int min;
        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else min = c;
        System.out.println("Task 1" + " - " + "Numbers:" + a + " , " + b + " , " + c + " , " + "Min--->" + min);

    }

    /**
     * Task 2
     * looking for min and max from 3 numbers
     */
    public static void MinAndMax(int a, int b, int c) {
        int min;
        int max;
        if (a < b && a < c) {
            min = a;
            max = Math.max(b, c);
        } else if (b < a && b < c) {
            min = b;
            max = Math.max(a, c);
        } else {
            min = c;
            max = Math.max(a, b);
        }
        System.out.println("Task 2" + " - " + "Min--->" + min + "Max--->" + max);
    }
    /**
     * Task 3
     * looking for min from numbers
     */
    public static void Min2(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println("Task 3"+ " - "+"Min--->" + a);
        } else if (b < a && b < c) {
            System.out.println("Task 3"+ " - "+"Min--->" + b);
        } else if (c < a && c < b) {
            System.out.println("Task 3"+ " - "+"Min--->" + c);
        } else if (a == b && b == c) {
            System.out.println("Task 3"+ " - "+"Min--->" + a + " , " + b + " , " + c);
        }else if (a == b) {
            System.out.println("Task 3"+ " - "+"Min--->" + a + " , " + b );
        }else if (b == c) {
            System.out.println("Task 3"+ " - "+"Min--->"  + b + " , " + c);
        }else {
            System.out.println("Task 3"+ " - "+"Min--->"  + a + " , " + c);
        }
    }

    /**
     * Task 4
     * check if the number is even
     */
    public static boolean ChetNeChet(int a) {
        if (a % 2 == 0) {
            return true;
        } else
            return false;
    }

    /**
     * Task 5
     * check if 2 numbers сan divide without  Remainder
     */
    public static boolean CheckingRemainderOfTheDivision(int a, int b) {
        if (a % b == 0) {
            return true;
        } else
            return false;

    }
    /**
     * Task 6
     * The closest number to 10
     */
    public static void ClosestNumber (int a, int b) {
        if (Math.abs(a - 10) < Math.abs(b - 10)) {
            System.out.println("Task 6" + " - " + "Closest number is - " + a);
        } else if (Math.abs(a - 10) > Math.abs(b - 10)) {
            System.out.println("Task 6" + " - " + "Closest number is - " + b);
        } else {
            System.out.println("Task 6" + " - " + "Distance between numbers are similar");
        }
    }
    /**
     * 7) Посчитайте, сколько будет стоить аренда квартиры за заданное число дней, если известно,
     * что за 1 день ее стоимость 40 грн. Причем, если съемщик прожил в ней больше 5 дней, он
     * получит скидку 20 грн, а если больше 7 дней, то скидка составит 50 грн.
     */
    public static void HouseRenting (int Days){
        int price ;
        if (Days < 5){
            price = Days * 40;
            System.out.println("Task 7" + " - " + price + "UAH");
        }else if( Days >5 && Days < 7){
            price = Days * 40 - 20;
            System.out.println("Task 7" + " - " + price + "UAH" + "(Congratulate, you have discount -20 UAH)");
        } else{
            price = Days * 40 - 50;
            System.out.println("Task 7" + " - " + price + "UAH" + "(Congratulate, you have discount -50 UAH)");

        }
    }
}
