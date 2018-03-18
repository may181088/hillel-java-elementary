package ua.od.hillel;

public class Main {

    public static void main (String[] args ) {
        findMinOfThree(10,12,12);
        findMinAndMaxOfThree(1,1,2);
        findMinOfThreeVsDuplicates(11,11,11);
        checkOnEven(5);
        checkOnDivide(10,5);
        findCloserToTenNumber(25,1);
        calculateRatePrice(10);


    }
    /** Task1: Find minimum from 3 numbers
     * Найти минимальное из 3х чисел
     * P.s. если числа будут равны, то выведется одно из равных чисел(сделано дабы избежать ошибки)
     * */
    public static void findMinOfThree(int num1, int num2, int num3) {

        System.out.println("Task1 method");
        if (num1<=num2 && num1<=num3){
            System.out.println("The smallest number is: " + num1);
        }
        else if (num1<=num2 && num1>=num3){
            System.out.println("The smallest number is: " + num3);
        }
        else {
            System.out.println("The smallest number is: " + num2);
        }

    }



    /** Task2: Find minimum & maximum from 3 numbers
     * Найти среди 3х чисел максимальное и минимальное
     * P.s. если числа будут равны, то выведется одно из равных чисел(сделано дабы избежать ошибки)
     * */
    public static void findMinAndMaxOfThree(int num1, int num2, int num3) {

        System.out.println("Task2 method");
        if (num1<=num2 && num1<=num3){
            System.out.println("The smallest number is: " + num1);
            if(num2>=num3){
                System.out.println("The biggest number is: " + num2);
            }
            else{
                System.out.println("The biggest number is: " + num3);
            }
        }
        else if (num1<=num2 && num1>=num3){
            System.out.println("The smallest number is: " + num3);
            if(num2>=num1){
                System.out.println("The biggest number is: " + num2);
            }
            else {
                System.out.println("The biggest number is: " + num1);
            }

        }
        else {
            System.out.println("The smallest number is: " + num2);
            if(num1>=num3){
                System.out.println("The biggest number is: " + num1);
            }
            else {
                System.out.println("The biggest number is: " + num3);
            }
        }

    }
    /** Task3: Find min number from 3's, output all smallest number
     * Найти минимальное из 3х чисел, причем, если минимальных несколько вывести все такие числа
     * */
    public static void findMinOfThreeVsDuplicates(int num1, int num2, int num3){


        System.out.println("Task3 method");
        if (num1<num2 && num1<num3){
            System.out.println("The smallest number is: " + num1);
        }
        else if (num1<num2 && num1>num3){
            System.out.println("The smallest number is: " + num3);
        }
        else if(num1==num2 && num2==num3){
            System.out.println("Three numbers are equals!");
        }
        else if(num1==num2 && num1!=num3){
            if(num1<num3){
                System.out.println("The smallest number is: " + num1 + " & " + num2);
            }
            else{
                System.out.println("The smallest number is: " + num3);
            }
        }
        else if(num1==num3 && num1!=num2 ){
            System.out.println("The smallest number is: " + num1 + " & " + num3);
        }
        else {
            if(num2==num3){
                System.out.println("The smallest number is: " + num2 + " & " + num3);
            }
            else{
                System.out.println("The smallest number is: " + num2);
            }

        }

    }

    /** Task4: Check numbers on even or odd
     * Написать программу, которая проверит, является ли число четным или нечетным
     * */
    public static void checkOnEven(int num1) {

        System.out.println("Task4 application");
        if (num1%2==0){
            System.out.println("The number is even!");
        }
        else{
            System.out.println("The number is odd!");
        }
    }

    /** Task5: Check numbers for division without residue
     * Даны 2 числа, определить делится ли первое число на второе без остатка
     * */
    public static void checkOnDivide(int num1, int num2) {

        System.out.println("Task5 application");
        if (num1%num2==0){
            System.out.println("Divides w/o remainder!");
        }
        else{
            System.out.println("Divides with remainder!");
        }

    }
    /** Task6: Find numbers that closer to 10
     * Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11
     * */
    public static void findCloserToTenNumber(int num1, int num2) {

        System.out.println("Task6 application");
        if (Math.abs(num1 - 10 )<= Math.abs(num2 - 10 )){
            System.out.println("Number " + num1 + " is closer to 10!");
        }
        else{
            System.out.println("Number " + num2 + " is closer to 10!");
        }

    }
    /** Task7: Calculate rent price
     * Посчитайте, сколько будет стоить аренда квартиры за заданное число дней, если известно, что за 1 день ее стоимость 40 грн.
     * Причем, если съемщик прожил в ней больше 5 дней, он получит скидку 20 грн, а если больше 7 дней, то скидка составит 50 грн.
     * */
    public static void calculateRatePrice(int days){

        System.out.println("Task7 application");
        int discount = 0;
        if (days > 5 && days <=7) {
            discount = 20;
        } else if (days > 7) {
            discount = 50;
        }
        int total = days * 40 - discount;
        System.out.print("Total order: " + total);
    }

}
