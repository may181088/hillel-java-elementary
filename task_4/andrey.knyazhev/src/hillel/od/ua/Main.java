package hillel.od.ua;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("First sequence");
        sequence1();
        System.out.println("Second sequence");
        sequence2();
        System.out.println("Third sequence");
        sequence3();
        System.out.println("Third sequence");
        sequence4();
        System.out.print("Summary of the first N numbers of array");
        arrayNsum();
        System.out.println("Find min and max number of array");
        minAndMax();
        System.out.println("Summary of even and odd numbers");
        sumEvenOdd();
        happyTicket();
        binar();
        fiveMinimal();

    }
    public static void sequence1(){ // 1.Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
     for (int i = 1000; i < 10000; i += 3)
         System.out.println(i);
    }
    public static void sequence2(){ // 2.Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
        int counter = 0;
        int i = 1;
       do
           {
               System.out.println(i);
               i += 2;
               counter++;
       }
       while (counter < 50);
    }
    public static void sequence3(){ // 3.Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
        for (int i = 90; i >= 0; i -= 5)
            System.out.println(i);
    }
    public static void sequence4(){ //4.Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
        int counter = 0;
        int i = 2;
        do
        {
            System.out.println(i);
            i *= 2;
            counter++;
        }
        while (counter < 20);
    }
    public static void arrayNsum(){ // 5.Найти сумму первых n элементов массива
        int arrLength = 10;
        int n = 5;
        int sum = 0;
        int[] arr = new int[arrLength];
        System.out.println("Array: ");
        for (int i = 0; i < arrLength; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        for(int j = 0; j < n; j++)
            sum = sum + arr[j];
        System.out.println("'[\nSummary of the firs " + n + " numbers = " + sum);
    }
    public static void minAndMax(){ // 6.Найти минимальный и максимальный элемент массива
        int arrLength = 10;
        int[] arr = new int[arrLength];
        System.out.println("Array: ");
        for (int i = 0; i < arrLength; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        int min = arr[0];
        int max = arr[0];
        for(int j = 0; j < arrLength; j++){
            if(arr[j] < min) min = arr[j];
            if(arr[j] > max) max = arr[j];
        }
        System.out.println("\nMin number = " + min + ", max number = " + max);
    }
    public static void sumEvenOdd(){ // 7.Найти сумму всех четных и сумму всех нечетных элементов массива
        int evenSum = 0;
        int oddSum = 0;
        int arrLength = 10;
        int[] arr = new int[arrLength];
        System.out.println("Array: ");
        for (int i = 0; i < arrLength; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        for (int j = 0; j < arrLength; j++){
            if ((arr[j] % 2) == 0) evenSum += arr[j];
            else oddSum = arr[j];
        }
        System.out.println("\nSummary of even numbers = " + evenSum + "\nSummary of odd numbers = " + oddSum);
    }
    public static void happyTicket(){ // 8.Найти все счастливые билеты от 100000 до 999999
        System.out.println("Happy tickets: ");
        for(int i = 100000; i <= 999999; i++){
            if ((((i / 100000) % 10)+ ((i / 10000) % 10) + ((i / 1000) % 10)) == (((i / 100) % 10) + ((i / 10) % 10) + (i %10)))
                    System.out.println(i);
        }
    }
    public static void binar(){//9.Перевести число в двоичную систему счисления
        System.out.println("Enter number to transform into binar code");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Integer.toString(num, 2));
    }
    public static void fiveMinimal(){ // 10.Вывести первые 5 минимальных элементов массива
        int arrLength = 10;
        int[] arr = new int[arrLength];
        System.out.println("Array: ");
        for (int i = 0; i < arrLength; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nFive minimal numbers: ");
        for (int j = 0; j < 5; j++)
            System.out.print(arr[j] + " ");
    }
}
