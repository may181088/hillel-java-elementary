package ua.od.hillel;

public class Main {

    public static void main(String[] args) {
//        firstTask();
//        secondTask();
//        thirdTask();
//        fourthTask();
//        int[] arr = new int[20];
//        initArray(arr);
//        printArray(arr);
//        System.out.println("");
//        System.out.println(fiveTask(arr,5));
//        sixTask(arr);
//        sevenTask(arr);
//        eightTask();
//        nineTask(7);
//        tenTask(arr);
        System.out.println(elevenTask(4546854643154684L));
    }

    public static void firstTask() {
        for (int i = 1000; i < 10000; i += 3) {
            System.out.println(i);
        }
    }

    public static void secondTask() {
        int element = 1;
        for (int i = 0; i < 55; i++) {
            System.out.println(element);
            element += 2;
        }
    }

    public static void thirdTask() {
        int element = 90;
        while (element >= 0) {
            System.out.println(element);
            element -= 5;
        }
    }

    public static void fourthTask() {
        int res = 2;
        for (int i = 0; i < 20; i++) {
            System.out.println(res);
            res *= 2;
        }
    }

    public static int fiveTask(int[] arr, int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] initArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void sixTask(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("min: " + min + " max: " + max);
    }

    public static void sevenTask(int[] arr) {
        int sumOfEven = 0, sumOfNotEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) sumOfEven += arr[i];
            else sumOfNotEven += arr[i];
        }
        System.out.println("Sum OF Even: " + sumOfEven + " Sum of Not Even: " + sumOfNotEven);
    }

    public static void eightTask() {
        int res1, res2;
        for (int i = 100000; i <= 999999; i++) {
            res1 = i / 1000;
            res2 = i % 1000;
            if ((res1 / 100) + (res1 % 10) + (res1 % 100 / 10) == (res2 / 100) + (res2 % 10) + (res2 % 100 / 10))
                System.out.println("Lucky number :" + i);
        }
    }


    public static void nineTask(int num) {
        int a, b = num;
        String tmp = "";
        while (b != 0) {
            a = b % 2;
            tmp = a + tmp;
            b /= 2;
        }
        System.out.print("Number: " + num + " in binary = " + tmp);
    }

    public static void tenTask(int[] arr) {
        int min = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (count == 5) return;
            if (arr[i] == min) {
                System.out.println(arr[i]);
                count++;
            }
        }
    }

    public static long elevenTask(long num) {
        long res = 0;
        int count = String.valueOf(Math.abs(num)).length();
        for (int i = 0; i <= count; i++) {
            res += (num % 10);
            num /= 10;
        }
        count = String.valueOf(Math.abs(res)).length();
        if (count > 1) res = elevenTask(res);
        return res;
    }

}


