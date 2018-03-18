package ua.od.hillel;

/**
 * 1) Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
 * 2) Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
 * 3) Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
 * 4) Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
 * 5) Найти сумму первых n элементов массива
 * 6) Найти минимальный и максимальный элемент массива
 * 7) Найти сумму всех четных и сумму всех нечетных элементов массива
 * 8) Найти все счастливые билеты от 100000 до 999999:
 *    билет счастливый если сумма первых трех цифр равна сумме трех последних
 *    например,123312: 1+2+3==3+1+2
 * 9) Перевести число в двоичную систему счисления
 * 10) Вывести первые 5 минимальных элементов массива
 * 11) Write  a program to repeatedly add all the digits until the result has only one digit of a given non-negative number:
 *     The digital root of 555555 = 5 + 5 + 5 + 5 + 5 + 5 = 30 = 3 + 0 = 3
 * */

public class Main {

    public static void main(String[] args) {

    /*Раскоментируйте нужный метода для проверки*/

//        printSequence();
//        printFirstNElementsOne(55);
//        printAllNonnegative();
//        printFirstNElementsTwo(20);
//        calcSumElemArray(new int[]{1,2,4,5,6,8,9}, 3);
//        findMaxAndMin(new int[]{21,-35,4,-1,0,8,9});
//        sumEvenAndOdd(new int[]{1,2,4,5,6,8,9});
//        findHappyTicket(100000,999999);
//        toBinary(23);
//        printFirstFiveMax(new int[]{9,1,9,2,4,9,-1,0,9,4,5,9,6,8,9});
//        calcDigitalRoot(555555);

    }
    /** 1 */
    public static void printSequence(){
        for (int i = 1000; i <= 9999; i+=3) {
            System.out.println(i);
        }
    }

    /** 2 */
    public static void printFirstNElementsOne(int num){

        int startNum = 1;
        for (int i = 0; i < num; i++) {
            System.out.println(i +": "+ startNum);
            startNum+=2;
        }
    }

    /** 3 */
    public static void printAllNonnegative(){
        for (int i = 90; i >= 0; i-=5) {
            System.out.println(i);
        }
    }

    /** 4 */
    public static void printFirstNElementsTwo(int num){
        int startNum = 2;
        for (int i = 0; i < num; i++) {
            System.out.println(i +": "+ startNum);
            startNum*=2;
        }
    }

    /** 5 */
    public static void calcSumElemArray(int[] array, int n) {
        if(n > array.length) {
            System.out.println(-1);
        } else {
            long currSum = 0;
            for (int i = 0; i < n; i++) {
                currSum += array[i];
            }
            System.out.println(currSum);
        }
    }

    /** 6 */
    public static void findMaxAndMin(int[] array) {

        int length = array.length;

        //сортировка Шелла когда-то писал, а новый алгоритм лень было писать, поэтому использовал этот
        for (int d = length/2; d >= 1; d = d/2) {
            for (int i = d; i < length; i++) {
                for (int j = i; j >= d ; j = j-d) {
                    if (array[j] < array[j-d]) {
                        int tmp = array[j-d];
                        array[j-d] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        }

        System.out.println("min: " + array[0] +" max: " + array[array.length -1] );
    }


    /** 7 */
    public static void sumEvenAndOdd(int[] array) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0) {
                evenSum += array[i];
            } else {
                oddSum += array[i];
            }
        }
        System.out.println("evenSum: " + evenSum +" oddSum: " + oddSum);
    }

    /** 8 */
    public static void findHappyTicket(int start, int end) {

        for (int i = start; i <= end; i++) {
            if ((i/100000)+((i/10000)%10)+((i/1000)%10) == ((i/100)%10)+((i/10)%10)+(i%10)) {
                System.out.println(i);
            }

        }
    }

    /** 9 */
    public static void toBinary(int number) {

        String binaryNum = "";
        int b;

        while (number != 0) {
            b = number % 2;
            binaryNum = b + binaryNum;
            number = number/2;
        }

        System.out.println(binaryNum);
    }

    /** 10 */
    public static void printFirstFiveMax(int[] array) {

        int max = array[0];                     // поиск максимума
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int count = 0;                             // вывод первых 5 максимумов
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                System.out.println("element["+i+"]: " + array[i] + " ");
                count++;
            }
            if (count == 5)
                break;
        }
    }

    /** 11 */
    public static void calcDigitalRoot(Integer number) {

        char[] nums = number.toString().toCharArray();
        Integer currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += Integer.parseInt(String.valueOf(nums[i]));
        }

        if (nums.length == 1) {           //условие выхода из рекурсии
            System.out.println(currSum);
            return;
        }

        calcDigitalRoot(currSum); // рекурсивный вызов
    }
}
