package com.company;

/** Main method */
public class Main {

    public static void main(String[] args) {
        minOfThreeNumbers(2, 2, 12);
        minAndMaxOfThreeNumbers(45, 67, 14);
        twoMinimalsNumbersOfThree(9, 9, 9);
        evenOrOddNumber(10);
        twoValuesDevideReminder(10, 1);
        closeValues(10, 8, 1);
        rentAparmetns (1);
    }



//----------------------------------------------------------------------------------------------------------------------

    /**
     * 1) Найти минимальное из 3х чисел (1)
     */
    public static void minOfThreeNumbers(int n1, int n2, int n3) {

        System.out.println("__________________________________________________________________________________________");
        System.out.println("Min values is: " + Math.min(Math.min(n1, n2), n3) + "   From: " + n1 + ", " + n2 + ", " + n3);


      /* int min = (n1 < n2 && n1 < n3) ? n1 : (n2 < n1 && n2 < n3) ? n2 : n3;
        System.out.println("min: " + min + "   from: " + n1 + ", " + n2 + " ," + n3);
        */


/*
      int min;

      if (n1<n2 && n1<n3){
         min = n1;
      }
         else if (n2<n1 && n2<n3){
         min = n2;
      }
      else {
         min = n3;
      }
      System.out.println("min: " + min + " from: " + n1 + ", " + n2 + " ,"+  n3);
*/


    }

//----------------------------------------------------------------------------------------------------------------------

    /**
     * 2)Найти среди 3х чисел максимальное и минимальное
     */
    public static void minAndMaxOfThreeNumbers(int n1, int n2, int n3) {

        System.out.println("__________________________________________________________________________________________");
        System.out.println("Min values is: " + Math.min(n1, Math.min(n2, n3)) + "   Max values is: " + Math.max(n1, Math.max(n2, n3)) + "   From: " + n1 + ", " + n2 + ", " + n3);

/*
      int min, max;
      if (n1<n2 && n1<n3){
         min = n1;
      }
      else if (n2<n1 && n2<n3){
         min = n2;
      }
      else {
         min = n3;
      }

      if (n1>n2 && n1>n3){
         max = n1;
      }
      else if (n2>n1 && n2>n3){
         max = n2;
      }
      else {
         max = n3;
      }
      System.out.println("min: " + min + " max: " + max + " from: " + n1 + ", " + n2 + " ,"+  n3);
*/

    }

//----------------------------------------------------------------------------------------------------------------------

    /**
     * 3)Найти минимальное из 3х чисел, причем, если минимальных несколько вывести все такие числа
     */
    private static void twoMinimalsNumbersOfThree(int n1, int n2, int n3) {

        String result = (n1 == n2 && n2 == n3 ? result = ("All values is equale. From: " + n1 + ", " + n2 + ", " + n3) : n1 >= n2 && n1 >= n3 ? "The values: " + n2 + " and " + n3 + "  is minimal.     From: " + n1 + ", " + n2 + ", " + n3 : (n2 > n3) ? "The values: " + n1 + " and " + n3 + "  is minimal.     From: " + n1 + ", " + n2 + ", " + n3 : "The values: " + n1 + " and " + n2 + "  is minimal.     From: " + n1 + ", " + n2 + ", " + n3); ;
        System.out.println("__________________________________________________________________________________________");
        System.out.println(result);


      /*int min1, min2;


      if (n1 >= n2 && n1 >= n3) {
         min1 = n2;
         min2 = n3;
      } else {
         min1 = n1;
         if (n2 >= n3) {
            min2 = n3;
         } else {
            min2 = n2;
         }
      }
        System.out.println("__________________________________________________________________________________________");
      System.out.println("min1: " + min1 + "  min2: " + min2 + "   from: " + n1 + ", " + n2 + ", " + n3);
        */
    }

//----------------------------------------------------------------------------------------------------------------------

    /**
     * 4) Написать программу, которая проверит, является ли число четным или нечетным
     */

    private static void evenOrOddNumber(int n1) {


        String result = n1%2==0 ? "Even" : "Not even";
        System.out.println("__________________________________________________________________________________________");
        System.out.println("Answer: " + result + "     Value is: " + n1);

      /* if (n1%2==0) {
         System.out.println("Even");
      }
      else  {
      System.out.println("Not even");
         }
   */
    }

//----------------------------------------------------------------------------------------------------------------------

    /**
     * 5) Даны 2 числа, определить делится ли первое число на второе без остатка
     */

    private static void twoValuesDevideReminder(double n1, int n2) {

        double answer = n1 / n2;

        String result = (answer % 1 == 0) ? "Answer: Yep!     Result: " + answer + "     From: " + n1 + ", " + n2 : "Answer: Noman :(     Result: " + answer + "     From: " + n1 + ", " + n2;
        System.out.println("__________________________________________________________________________________________");
        System.out.println(result);

        /*
        if (answer % 1 == 0) {
            System.out.println("0");
        }
        else {
            System.out.println("isn't");
        }
        */
    }


//----------------------------------------------------------------------------------------------------------------------

    /**
     *6) Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11
     */

    private static void closeValues(int n1, int n2, int n3) {

        int result = (Math.abs(n1-n2)<Math.abs(n1-n3)) ? n3 : n2;
        System.out.println("__________________________________________________________________________________________");
        System.out.println("Answer: " + result + "   From: " + n2 + "   and   " + n3);



    }

//----------------------------------------------------------------------------------------------------------------------
    /**
     * 7) Посчитайте, сколько будет стоить аренда квартиры за заданное число дней, если известно, что за 1 день ее
     * стоимость 40 грн. Причем, если съемщик прожил в ней больше 5 дней, он получит скидку 20 грн, а если больше
     * 7 дней, то скидка составит 50 грн.
     */

    private static void rentAparmetns(int n1) {

        int result = (n1>=8) ? (n1*40)-50 : (n1>=6) ? (n1*40)-20 : n1*40;
        System.out.println("__________________________________________________________________________________________");
        System.out.println("Cost: " + result + "uah.   Days: " + n1);

      /*
      int = result;
      if (i>=8) {
         result = (i*40)-50;
      }
      else if (i>=6) {
         result = (i*40)-20;
      }
      else {
         result = i*40;
      }

      System.out.println("Result: " + result + "   Days: " + i);
      */


    }


}