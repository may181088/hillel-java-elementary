package ua.od.hillel;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 31, 5, 61, 7, 8, 11, 65, 32, 10, 54, 21, 76};
//        task_1(1000, 3, 4);
//        task_2(1, 2, 55);
//        task_3(90, 0, -5);
//        task_4(2, 2, 20);
//        task_5(arr, 5);
//        task_6(arr);
//        task_7(arr);
//        task_8(100000, 999999);
//        task_9(5124);
//        task_10(arr, 5);
//        task_11(555555);
    }

    public static void task_1(int start_num, int step, int max_length_num) {
        String check_sign = "plus ";
        if (step < 0) check_sign = "minus ";

        System.out.println("Task 1:");
        System.out.println("Start of sequence: " + start_num + ", " + "step sequence: " +
                check_sign + step + ", " + "the maximum length of a number: " + max_length_num);

        int lenght_num = max_length_num;

        while (lenght_num <= max_length_num) {
            System.out.print(start_num + " ");
            start_num += step;
            lenght_num = String.valueOf(Math.abs(start_num)).length();
        }
    }



    public static void task_2(int start_num, int step, int amount_elem) {
        String check_sign = "plus ";
        if (step < 0) check_sign = "minus ";

        System.out.println("Task 2:");
        System.out.println("Start of sequence: " + start_num + ", " + "step sequence: " +
                check_sign + step + ", " + "the maximum element: " + amount_elem);

        for (int i = 0; i < amount_elem; i++) {
            System.out.print(start_num + " ");
            start_num += step;
        }
    }

    public static void task_3(int start_num, int end, int step) {
        String check_sign = "plus ";
        if (step < 0) check_sign = "minus ";

        System.out.println("Task 3:");
        System.out.println("Start of sequence: " + start_num + ", " + "step sequence: " +
                check_sign + Math.abs(step) + ", " + "last digits: " + end);

        while (end <= start_num) {
            System.out.print(start_num + " ");
            start_num += step;
        }
    }

    public static void task_4(int start_num, int step, int amount_elem) {
        System.out.println("Task 4:");
        System.out.println("Start of sequence: " + start_num + ", " + "step sequence: *" +
                step + ", " + "the maximum element: " + amount_elem);

        for (int i = 0; i < amount_elem; i++) {
            System.out.print(start_num + " ");
            start_num *= step;
        }
    }

    public static void task_5(int[] arr, int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += arr[i];
        }

        System.out.println("Task 5");
        System.out.println("Sum of the first " + num + " elements array: " + Arrays.toString(arr) + " = " + sum);
    }

    public static void task_6(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        System.out.println("Task 6:");
        System.out.println("Minimum and maximum number of array: " +
                Arrays.toString(arr) + ", min = " + min + ", max = " + max);
    }

    public static void task_7(int[] arr) {
        int sumEven = 0, sumNotEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) sumEven += arr[i];
            else sumNotEven += arr[i];
        }
        System.out.println("Task 7:");
        System.out.println("Sum of even numbers of arrays: " + Arrays.toString(arr) +
                " = " + sumEven + " and sum of not even: " + sumNotEven);
    }

    public static void task_8(int start_num, int end_num) {
        System.out.println("Task 8:");
        System.out.print("List of lucky numbers in the range " + start_num + " - " + end_num + ": ");
        int res1, res2;
        for (int i = start_num; i <= end_num; i++) {
            res1 = i / 1000; //первые 3 цифры
            res2 = i % 1000; //вторые 3 цифры
            if ((res1 / 100) + (res1 % 10) + (res1 % 100 / 10) == (res2 / 100) + (res2 % 10) + (res2 % 100 / 10))
                System.out.print(i + " ");
        }
    }


    public static void task_9(int num) {
        System.out.println("Task 9:");
        System.out.print("Number " + num + " in the binary representation: ");

        int b;
        StringBuffer temp = new StringBuffer();
        while (num != 0) {
            b = num % 2;
            temp.append(b);
            num /= 2;
        }
        temp.reverse();
        System.out.print(temp);
    }

    public static void task_10(int[] arr, int quantityMinNum) {
        System.out.println("Task 10:");
        System.out.print(quantityMinNum + " minimum numbers array: " + Arrays.toString(arr) +
                " = ");
        int[] temp = arr.clone(); //изолируем масив
        int j;               //счетчик цикла
        int findMinNum = 0; //найденно элементов
        int nElems = arr.length;      //количество элементов масива

        while (findMinNum < quantityMinNum) {

            int min = temp[0];

            for (int i = 0; i < temp.length; i++) { //ищем минимальное число
                if (temp[i] < min) min = temp[i];
            }
            System.out.print(min + " ");

            for (j = 0; j < nElems; j++) {   //поиск удаляемого элемента
                if (temp[j] == min)
                    break;
                }
            for (int k = j; k < nElems - 1; k++) //сдвиг последующих элементов
                temp[k] = temp[k + 1];
            nElems--;                            //уменьшение размера
            findMinNum ++; //+1 минимальное число
        }
    }

    public static void task_11(int num) {
        int result = findSumDigit(num);
        System.out.println("Task 11:");
        System.out.println("Repeatedly add all the digits until number " + num +
                ", the result has only one digit of a given non-negative number = " + result);
    }

    public static int findSumDigit(int num) {
        int sum = 0;
        int numDigit = String.valueOf(Math.abs(num)).length();
        for (int i = 0; i <= numDigit; i++) {
            sum += (num % 10);
            num /= 10;
        }

        if (sum > 9) sum = findSumDigit(sum);
        return sum;
    }
}
