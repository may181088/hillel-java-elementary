package ua.od.hillel;

/**
 * Home task for Lesson 2
 * @author Ivan Lupolov
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("minOfThreeNumbers() => " + minOfThreeNumbers(1,1,3));
        System.out.println("minAndMaxNumbers() => " + minAndMaxNumbers(3, 2, 2));
        System.out.println("allMinOfThreeNumbers() => " + allMinOfThreeNumbers(5,7,5));
        System.out.println("isParity() => " + isParity(4));
        System.out.println("isDivisionWithoutResidue() => " + isDivisionWithoutResidue(5, 2));
        System.out.println("closestToNumberTen() => " + closestToNumberTen(54, 38));
        System.out.println("calculateRent() => " + calculateRent(8));
    }

    /** 1) Find the minimum of the three numbers  */
    public static int minOfThreeNumbers(int num1, int num2, int num3) {
        int min = num1;

        if (min > num2) {
            min = num2;
        }
        if (min > num3){
            min = num3;
        }

        return min;
    }

    /** 2) Find the minimum and maximum of the three numbers  */
    public static String minAndMaxNumbers(int num1, int num2, int num3) {
        int min = num1;
        int max = num2;

        if (min > num2) {
            min = num2;
            max = num1;
        }
        if (min > num3){
            min = num3;
        } else if(max < num3) {
            max = num3;
        }

        return min + " " + max;
    }

    /** 3) Find all the minima of the three numbers  */
    public static String allMinOfThreeNumbers(int num1, int num2, int num3) {

        int min = minOfThreeNumbers(num1,num2,num3);
        int countMin = 0;
        int[] nums = {num1, num2, num3};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min) {
                countMin++;
            }
        }

        if (countMin == 3)
            return "Numbers are equals each other.";
        if (countMin == 2)
            return min +" "+ min;
        return min +"";
    }

    /** 4) Check the parity of a number */
    public static boolean isParity(int num) {
        return num%2 == 0 ? true : false;
    }

    /** 5) Check for division of the first number by the second number without a remainder */
    public static boolean isDivisionWithoutResidue(int num1, int num2) {
        return num1%num2 == 0 ? true : false;
    }

    /** 6) Find the closest number to ten */
    public static String closestToNumberTen(int num1, int num2) {
        if(Math.abs(num1-10) == Math.abs(num2-10)) {
            return "The numbers are equidistant.";
        } else if(Math.abs(num1-10) < Math.abs(num2-10)) {
            return String.valueOf(num1);
        } else {
            return String.valueOf(num2);

        }
    }

    /** 7) Count how much it will cost to rent an apartment for a specified number of days,
     *  if you know that for 1 day its cost is 40 UAH. And, if the tenant has lived in it
     *  more than 5 days, he will receive a discount of 20 UAH, and if more than 7 days,
     *  the discount will be 50 UAH.  */
    public static int calculateRent(int day) {
        if (day > 7) {
            return day*40 - 50;
        } else if (5 < day && day <= 7) {
            return day*40 - 20;
        } else {
            return day*40;
        }
    }

}
