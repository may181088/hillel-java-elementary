/**
 * 1st home work
 */

public class HW_1 {


    public static void main(String[] args) {
        int a = 2, b = 2, c = 1;
        printMinOrMax(a, b, c, true, true);
        printCheckEven(a);
        printBalanceAfterDivision(a, b);
        printGetNearestNum(a, b, 10);
        printGetTotalCostLiv(8,40, 20, 50);
    }

    /**
     * 1-3 task: minimum and maximum of three numbers (fix, if there are several)
     *
     * @param a 1sf number
     * @param b 2 number
     * @param c 3 number
     */

    public static int getMinimum(int a, int b, int c) {
        int min=a;
        if(min>b)
            min=b;
        if(min>c)
            min=c;
        return min;
    }

    public static int getMaximum(int a, int b, int c) {
        int max=a;
        if(max<b)
            max=b;
        if(max<c)
            max=c;
        return max;
    }

    /**
     * @param enable_max true or false
     * @param enable_min true or false
     */

    public static void printMinOrMax(int a, int b, int c, boolean enable_max, boolean enable_min){

        int number_of_repeated_max = 0;
        int number_of_repeated_min = 0;

        int max = getMaximum(a, b, c);
        int min = getMinimum(a, b, c);

        if (enable_max) {
            if (max == a) {
                number_of_repeated_max++;
            }
            if (max == b) {
                number_of_repeated_max++;
            }
            if (max == c) {
                number_of_repeated_max++;
            }
            System.out.println("This is a maximum number of numbers " + a + ", " + b + ", " + c + ": " + max +
                    " and repeated " + number_of_repeated_max + " " + "time.");
        }

        if (enable_min) {
            if (min == a) {
                number_of_repeated_min++;
            }
            if (min == b) {
                number_of_repeated_min++;
            }
            if (min == c) {
                number_of_repeated_min++;
            }
            System.out.println("This is a minimum number of numbers " + a + ", " + b + ", " + c + ": " + min +
                    " and repeated " + number_of_repeated_min + " " + "time.");
        }
    }

    /**
     * 4 task: check the parity of a number
     *
     * @param n the number to be checked for parity
     */

    public static boolean checkEven(int n) {
        return n % 2 == 0;
    }

    public static void printCheckEven(int n){
        System.out.println("Number " + n + " is even: " + checkEven(n));
    }

    /**
     * 5 tusk: given 2 numbers, determine whether the first number is divided into the second without a remainder
     *
     * @param a 1st number
     * @param b 2 number
     */
    public static boolean balanceAfterDivision(int a, int b) {
        return a % b == 0;
    }

    public static void printBalanceAfterDivision(int a, int b){
        System.out.println("Number " + a + " divisible by " + b + " without residue: " + balanceAfterDivision(a, b));
    }
    /**
     * 6 tusk: find the closest one to number of the 2 given numbers.
     * For example, among the numbers 8 and 11 closest to ten 11
     *
     * @param a 1st number
     * @param b 2 number
     * @param point number compare
     */

    public static int getNearestNum(int a, int b, int point) {
        int differ_a = Math.abs(point - a);
        int differ_b = Math.abs(point - b);

        if (differ_a > differ_b) {
            return b;
        } else if (differ_a == differ_b) {
            return a+b; //It is better to return the two values ​​separately,
            // but I do not know how to do it so I use crutches :)
        } else {
            return a;
        }
    }

    public static void printGetNearestNum(int a, int b, int point){
        int result = getNearestNum(a, b, point);
        if (result == a + b) {
            System.out.println("Nearest number of numbers " + a + " and " + b + " to " + point +  ": equal distance.");
        } else {
            System.out.println("Nearest number of numbers " + a + " and " + b + " to " + point + ": " +
                    result);
        }
    }

    /**
     * 7 tusk: count how much it will cost to rent an apartment for a specified number of days,
     * if you know that for 1 day its cost is 40 UAH. And,
     * if the tenant has lived in it more than 5 days, he will receive a discount of 20 UAH,
     * and if more than 7 days, the discount will be 50 UAH.
     *
     * @param days number of lease days
     * @param cost_days one day cost
     * @param discount_6_days discount if booked more than 5 days, but less than 8 days
     * @param discount_8_days discount if booked more than 7 days
     */
    public static int getTotalCostLiv (int days, int cost_days, int discount_6_days, int discount_8_days) {
        int total_price = 0;

        if (days <= 0 || cost_days <= 0 || discount_6_days < 0 || discount_8_days < 0) {
            return total_price;
        } else if (days <= 5) {
            total_price = cost_days * days;
        } else if (days <= 7) {
            total_price = cost_days * days - discount_6_days;
        } else {
            int disc_6_days = 0; //one-time discount if after the discount for every 8 day booked even more 5 days
            if (days % 8 * 8 == 6 || days % 8 * 8 == 7) {
                disc_6_days = 1;
            }
            int disc_multip_8_days = days / 8; //discount for every 8 days
            total_price = cost_days * days - discount_8_days * disc_multip_8_days - disc_6_days;
        }
        return total_price;
    }

    public static void printGetTotalCostLiv(int days, int cost_days, int discount_6_days, int discount_8_days){
        int result = getTotalCostLiv(days, cost_days, discount_6_days, discount_8_days);
        if (result > 0) {
            System.out.println("Full cost of living: " + result);
        } else {
            System.out.println("Invalid value!");
        }
    }
}
