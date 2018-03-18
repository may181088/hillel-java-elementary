package ua.od.hillel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
        summaMassiva(3, new int[]{4, 5, 3, 2, 10});
        minAndMaxElement(new int[]{4, 5, 3, 2, 10});
        summOddAndEven(new int[]{1, 2, 3, 4});
        findLuckyTickets();
        intoBinary(3);
        findFifthMinFromArray(new int[]{1,4,4, 5, 3, 1, 10});
        eleventhTask(555555);

    }





    /*
     Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006
     */
    private static void firstTask(){
        System.out.println("First task. \n Here is the list of digits: ");
        for(int i = 1000; i< 10000; i+=3){
            System.out.print(i + " ");
        }

    }
    /*
    Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….

     */
    private static void secondTask(){
        System.out.println("\n Second task. \n Here is the list of digits: ");
        for(int i = 1; i < 56; i++){
            System.out.print(i + " ");
        }

    }

    /*
    Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….

     */

    private static void thirdTask(){
        System.out.println("\n Third task. \n Here is the list of digits: ");
        for(int i = 90; i >=0; i-=5){
            System.out.print(i + " ");
        }

    }

    /*
    Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….

     */
    private static void fourthTask(){
        System.out.println("\n Fourth task. \n Here is the list of digits: ");
        int number = 2;
        for(int i = 0; i < 20; i++, number*=2){
            System.out.print(number + " ");
        }

    }
    /*
    Найти сумму первых n элементов массива

     */
    private static void summaMassiva(int n, int[] array){
        System.out.println("\n Fifth task.");
        int summa = 0;
        for(int i = 0; i < n; i++){
            summa+= array[i];
        }
        System.out.println("Summa: " + summa);
    }
    /*
    Найти минимальный и максимальный элемент массива

     */
    private static void minAndMaxElement(int[] array){
        System.out.println("\n Sixth task.");
        int min = array[0];
        int max = array[0];
        for (int i: array){
            if(min > i){
                min = i;
            }
            else if(max < i){
                max = i;
            }
        }
        System.out.println("Min: " + min + " & Max : " + max);
    }

    /*
    Найти сумму всех четных и сумму всех нечетных элементов массива

     */
    private static void summOddAndEven(int[] array){
        System.out.println("\n Seventh task.");
        int odd = 0;
        int even = 0;
        for (int i: array){
            if( i % 2 == 0){
                even += i;
            }
            else {
                odd += i;
            }
        }
        System.out.println("Summa of odd: " + odd + " & Summa of even : " + even);
    }

    /*
    Найти все счастливые билеты от 100000 до 999999:
    билет счастливый если сумма первых трех цифр равна сумме трех последних
    например,123312: 1+2+3==3+1+2
     */
    private static void findLuckyTickets(){
        System.out.print("\nEight task. \nLucky tickets: ");
        for(int i = 100000; i<=999999; i++){
            int summaFirst = 0;
            int summaSecond = 0;
            int firstPart = i/1000;
            int secondPart = i%1000;
            for(int y = 1; y < 4; y++){
                summaFirst = summaFirst + firstPart%10;
                summaSecond = summaSecond + secondPart%10;
                firstPart = (firstPart - firstPart%10)/10;
                secondPart = (secondPart - secondPart%10)/10;
            }
            if(summaFirst==summaSecond) {
                System.out.print(i + " ");
            }

        }

    }

    /*
    Перевести число в двоичную систему счисления
     */
    private static void intoBinary(int n){
        System.out.println("\n Ninth task. \n Binary: " + Integer.toBinaryString(n));
    }

    /*
    Вывести первые 5 минимальных элементов массива
     */

    private static void findFifthMinFromArray(int[] array){
        System.out.print("\n Tenth task. \n Min 5 elements: ");
        int[] resultArray = new int[5];
        for(int i = 0; i<5; i++){
            int temp = 0;
            for (int y = i+1; y<array.length;y++){
                if(array[i]>array[y]){
                    temp = array[i];
                    array[i]=array[y];
                    array[y]=temp;
                }

            }
            resultArray[i] = array[i];

        }
        for (int i:
             resultArray) {
            System.out.print(i + " ");

        }
    }


    /*
    Write  a program to repeatedly add all the digits until the result has only one digit of a given non-negative number:
    The digital root of 555555 = 5 + 5 + 5 + 5 + 5 + 5 = 30 = 3 + 0 = 3
     */
    private static int summator(int n){
        int summa = 0;
        while (n > 0){
            summa = summa + n%10;
            n= n/10;
        }
        //System.out.println("summa" + summa);
        return summa;

    }

    private static void eleventhTask(int n){
        System.out.println("\n \n Eleventh task.");
        int result = n;
        while (result > 9 ){
            result = summator(result);

        }
        System.out.println("Result: " + result);

    }








}
