package ua.od.hillel;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean checkMain = true;
        boolean check = true;
        int choice=0;
        Scanner scanChoice = new Scanner(System.in);
        Scanner scanTxt = new Scanner(System.in);

        while (checkMain) {
            System.out.println("Lesson 4 - Homework\n" +
                    "1)  Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….\n" +
                    "2)  Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….\n" +
                    "3)  Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….\n" +
                    "4)  Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….\n" +
                    "5)  Найти сумму первых n элементов массива\n" +
                    "6)  Найти минимальный и максимальный элемент массива\n" +
                    "7)  Найти сумму всех четных и сумму всех нечетных элементов массива\n" +
                    "8)  Найти все счастливые билеты от 100000 до 999999:\n" +
                    "   билет счастливый если сумма первых трех цифр равна сумме трех последних, например,123312: 1+2+3==3+1+2\n" +
                    "9)  Перевести число в двоичную систему счисления\n" +
                    "10) Вывести первые 5 минимальных элементов массива\n" +
                    "11) Write  a program to repeatedly add all the digits until the result has only one digit of a given non-negative number:\n" +
                    "    The digital root of 555555 = 5 + 5 + 5 + 5 + 5 + 5 = 30 = 3 + 0 = 3\n");

            System.out.println("Make your choice [1..11]");
            check = true;
            while (check) {
                choice = scanChoice.nextInt();
                if (choice>0 && choice<12) {
                    check = false;
                }
                else System.out.println("error, try again");
            }

            switch (choice) {
                case 1:  fourDigits();
                    break;
                case 2:  first55();
                    break;
                case 3:  allPositives();
                    break;
                case 4:  first20();
                    break;
                case 5:  sumFirstN();
                    break;
                case 6:  minAndMax();
                    break;
                case 7:  sumEvensSumOdds();
                    break;
                case 8:  luckyTickets();
                    break;
                case 9:  binaryNumber();
                    break;
                case 10: minimals5();
                    break;
                case 11: digitalRoot();
                    break;
            }

            check = true;
            System.out.println("Would you like to do another task? [y,n]");
            while (check) {
                String yesOrNo = scanTxt.nextLine();
                if (yesOrNo.equals("n")) {
                    check = false;
                    System.out.println("Thanks for your time. Have a good day!");
                    checkMain = false;
                }
                else if (yesOrNo.equals("y")) {
                    check = false;
                    System.out.println("Lets do it again!");
                }
                else System.out.println("yes or no?");
            }
        }
    }

   /*
   Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
    */

    public static void fourDigits() {
        System.out.println("You've chosen to do next task:\n" +
                "Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 …");
        int first=0;
        Scanner scan = new Scanner(System.in);
        boolean check = true;
        int step = 0;
        int column = 0;
        int columnNumber = 0;

        int[] temp = firstAndStep();
        first = temp[0];
        step = temp[1];
//        System.out.println("Lets print all 4-digit elements of the sequence. Enter the first element (>=1000):");
//        while (check){
//            first = scan.nextInt();
//            if (first >= 1000 && first < 10000) {
//                check = false;
//            }
//            else System.out.println("try again");
//        }
//
//        System.out.println("Enter the step of this sequence:");
//        check = true;
//
//        while (check){
//            step = scan.nextInt();
//            if (step > 0 && step < (10000-first)) {
//                check = false;
//            }
//            else System.out.println("try again");
//        }
//
//        check = true;

        System.out.println("Enter the number of columns to print out:");
        while (check){
            columnNumber = scan.nextInt();
            if (columnNumber > 0 && columnNumber <= (10000-first)) {
                check = false;
            }
            else System.out.println("try again");
        }

        System.out.println("Here is your sequence:");
        for (; first < 10000; first = first + step) {
            System.out.print(first+" ");
            column++;
            if (column>columnNumber) {
                System.out.print("\n");
                column = 0;
            }
        }
        System.out.println();
    }

    /*
    Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
     */

    public static void first55() {
        System.out.println("You've chosen to do next task:\n" +
                "Создайте программу, выводящую на экран первые " +
                "55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….");
        int[] temp = firstAndStep();
        int first = temp[0];
        int step = temp[1];
        System.out.println("Here is the result sequence:");
        for (int i = 0; i < 55; i++) {
            System.out.println((i+1)+") "+first);
            first = first + step;
        }
    }

    /*
    Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
     */
    public static void allPositives() {
        System.out.println("You've chosen to do next task:\n" +
                "Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….");
        int[] temp = firstAndStep();
        int first = temp[0];
        int step = temp[1];

        if (step >= 0) {
            System.out.println("error, positive step!");
        }
        else {
            System.out.println("Here is the result sequence:");
            int n = 1;
            while (first>=0){
                System.out.println(n+") "+first);
                first = first + step;
                n++;
            }
        }
    }

    /*
    Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
     */
    public static void first20() {
        System.out.println("You've chosen to do next task:\n" +
                "Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….");
        int[] temp = firstAndStep();
        long first = temp[0];
        int step = temp[1];
        System.out.println("Here is the result sequence:");
        for (int i = 1; i < 21; i++) {
            System.out.println(i+") "+first);
            first = first*step;
        }
    }

    /*
    Найти сумму первых n элементов массива
     */
    public static void sumFirstN() {
        System.out.println("You've chosen to do next task:\n" +
                "Найти сумму первых n элементов массива");
        int[] temp = randArray();
        System.out.println("Here is your array:");
        printArray(temp);
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements would you like to sum?");
        int N = scan.nextInt();
        int[] tempN = new int[N];
        int sumN = 0;
        for (int i = 0; i < N; i++) {
            sumN = sumN + temp[i];
            tempN[i] = temp[i];
        }
        System.out.println("First "+N+" elements of your array are:");
        printArray(tempN);
        System.out.println("Their sum is "+sumN+".");
    }

    /*
    Найти минимальный и максимальный элемент массива
     */

    public static void minAndMax() {
        System.out.println("You've chosen to do next task:\n" +
                "Найти минимальный и максимальный элемент массива.");
        int[] temp = randArray();
        System.out.println("Here is your array:");
        printArray(temp);
        int nMax = 1, nMin = 1;
        int min = temp[0], max = temp[0];

        for (int i = 1; i < temp.length; i++) {
            if (temp[i]<=min) {
                if (temp[i]==min) {
                    nMin++;
                }
                else {
                    min = temp[i];
                    nMin = 1;
                }
            }
            else if(temp[i]>=max) {
                if (temp[i]==max) {
                    nMax++;
                }
                else {
                    max = temp[i];
                    nMax = 1;
                }
            }
        }
        System.out.println("Minimal element is "+min+" (in quantity "+nMin+").\nMaximal element is "+max+" (in quantity "+nMax+").");
    }

    /*
    Найти сумму всех четных и сумму всех нечетных элементов массива
     */

    public static void sumEvensSumOdds() {
        System.out.println("You've chosen to do next task:\n" +
                "Найти сумму всех четных и сумму всех нечетных элементов массива.");
        int[] temp = randArray();
        System.out.println("Here is your array:");
        printArray(temp);
        int sumEvens = 0, sumOdds = 0;


        for (int i = 0; i < temp.length; i++) {
            if (temp[i]%2==0) {
                sumEvens = sumEvens + temp[i];
            }
            else {
                sumOdds = sumOdds + temp[i];
            }
        }
        System.out.println("Sum of even elements is "+sumEvens+".\nSum of odd elements is "+sumOdds+".");
    }

    /*
    Найти все счастливые билеты от 100000 до 999999:\n" +
                "    билет счастливый если сумма первых трех цифр равна сумме трех последних\n" +
                "    например,123312: 1+2+3==3+1+2
     */

    public static void luckyTickets() {
        System.out.println("You've chosen to do next task:\n" +
                "Найти все счастливые билеты от 100000 до 999999:\n" +
                "билет счастливый если сумма первых трех цифр равна сумме трех последних, например,123312: 1+2+3==3+1+2");
        int[] temp = new int[6];
        for (int ticket = 100000; ticket < 1000000; ticket++) {
            int tempTicket = ticket;
            int div = 100000;
            for (int i = 0; i < temp.length; i++) {
                temp[i] = (tempTicket/div);
                tempTicket = (tempTicket%div);
                div /= 10;
            }

            if (temp[0] + temp[1]+temp[2] == temp[3] + temp[4]+temp[5]){
                System.out.println(ticket);
            }
        }
    }

    /*
    Перевести число в двоичную систему счисления
     */

    public static void binaryNumber() {
        System.out.println("You've chosen to do next task:\n" +
                "Перевести число в двоичную систему счисления\nEnter the number to convert to binary:");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.print("Binary representation of number "+N+" = ");
        String binaryN = "";
        int remainder = 0;
        //binary = N +binary;
        while (N != 0) {
            remainder = N%2;
            binaryN = remainder + binaryN;
            N /= 2;
        }
        System.out.println(binaryN);
    }

    /*
    Вывести первые 5 минимальных элементов массива
     */

    public static void minimals5() {
        System.out.println("You've chosen to do next task:\n" +
                "Вывести первые 5 минимальных элементов массива");
        int[] temp = randArray();
        System.out.println("Here is your array:");
        printArray(temp);
        Scanner scan = new Scanner(System.in);
        System.out.println("How many minimals would you like to find?");
        int N = scan.nextInt();
        int[] minimalsN = new int[N];

//        for (int i = 0; i < temp.length ; i++) {
//            int min = temp[i];
//            int min_i = i;
//            for (int j = i+1; j < temp.length; j++) {
//                if (temp[j]<min) {
//                    min = temp[j];
//                    min_i = j;
//                }
//                if (i != min_i) {
//                    int tmp = temp[i];
//                    temp[i] = temp[min_i];
//                    temp[min_i] = tmp;
//                }
//
//            }
//        }

        Arrays.sort(temp);
       // printArray(temp);
        System.out.println("Here are "+N+" minimal elements of your array:");

        for (int i = 0; i < N; i++) {
            if (i<(N-1)){
                System.out.print(temp[i]+" ");
            }
            else System.out.println(temp[i]);
        }
    }

    /*
    Write  a program to repeatedly add all the digits until the result has only one digit of a given non-negative number:\n" +
                "    The digital root of 555555 = 5 + 5 + 5 + 5 + 5 + 5 = 30 = 3 + 0 = 3
     */

    public static void digitalRoot() {
        System.out.println("You've chosen to do next task:\n" +
                "Write  a program to repeatedly add all the digits until the result has only one digit of a given non-negative number.");

        boolean check = true;
        boolean checkNumber = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number to get a digital root:");
        int number = scan.nextInt();
        System.out.print("The digital root of "+number);

        while (checkNumber) {

            System.out.print(" = ");

            int div = 1;
            int size = 1;
            do {
                if (number<(div*10)) {
                    check = false;
                }
                else {
                    div*=10;
                    size++;
                }
            } while (check);

            //div /=10;

            //System.out.print(" ***size = "+size+"***");

            int[] numbers = new int[size];
            int tempNumber = number;
            int tempSum = 0;

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = (tempNumber / div);
                tempNumber = (tempNumber % div);
                div /= 10;
                tempSum += numbers[i];

                if (i == (numbers.length-1)) {
                    System.out.print(numbers[i]);
                }
                else {
                    System.out.print(numbers[i]+" + ");
                }
            }

            number = tempSum;
            System.out.print(" = "+number);

            if (number < 10) {
               // System.out.print();
                checkNumber = false;
            }
        }
        System.out.println();
    }

    // ==============================================================

    public static int[] firstAndStep() {
        int[] result = {0,0};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first element of the sequence:");
        result[0] = scan.nextInt();
        System.out.println("Enter the step of the sequence:");
        result[1] = scan.nextInt();
        return result;
    }

    public static int[] randArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of your array");
        int size = scan.nextInt();
        System.out.println("Enter the lower range of your array");
        int lower = scan.nextInt();
        System.out.println("Enter the upper range of your array");
        int upper = scan.nextInt();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int)(lower+Math.random()*(upper-lower));
        }
        return result;
    }

    public static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
