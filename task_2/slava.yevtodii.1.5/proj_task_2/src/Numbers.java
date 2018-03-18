/**
 *  This is my Task_2 for Java Elementary.
 *  Each method for each point of homework task
 */
public class Numbers {

    public static void main(String[] args) {
        min3(12,19, 15);
        min3max(-2,10,-3);
        minsOut(-1,5,-1);
        evenOdd(17);
        divAB(10,3);
        closeTen(14,2);
        leaseCash(15);
    }

    /**
     * 1) Find min of 3 numbers
     * @param a first number
     * @param b second number
     * @param c third number
     */
    public static void min3(int a, int b, int c) {
        int min;
        if (a!=b&a!=c&b!=c){
            if(a<b&a<c){
                min=a;
            }
            else if (b<c) {
                min=b;
            }
            else min=c;
            System.out.println("1) "+min+" is minimum from numbers {"+a+", "+b+", "+c+"}.");
        }
        else {
            System.out.println("1) There are some equals!");
        }
    }

    /**
     * 2) Find min and max of 3 numbers
     * @param a first number
     * @param b second number
     * @param c third  number
     */
    public static void min3max(int a, int b, int c) {
        int min, max;
        if(a==b||a==c||b==c){
            System.out.println("2) There are some equals!");
        }
        else {
            if (a<b&a<c){
                min=a;
                if (b<c){
                    max=c;
                }
                else max=b;
            }
            else if (b<c){
                min=b;
                if (a<c){
                    max=c;
                }
                else max=a;
            }
            else {
                min=c;
                if (a<b){
                    max=b;
                }
                else max=a;
            }
            System.out.println("2) "+min+" is min, "+max+" is max from numbers {"+a+", "+b+", "+c+"}.");
        }
    }

    /**
     * 3) Find min of 3 numbers and print them out
     * @param a first number
     * @param b second number
     * @param c third number
     */
    public static void minsOut(int a, int b, int c) {
        int min=0, n=0;
        if (a==b&a==c&b==c){
            System.out.println("3) All three numbers {"+a+", "+b+", "+c+"} are equal!");
        }
        else if (a!=b&a!=c&b!=c){
            min3(a,b,c);
        }
        else {
            if (a==b) {
                if (a<c){
                    min=a;
                    n=2;
                }
                else {
                    min=c;
                    n=1;
                }
            }
            else if (a==c) {
                if (a<b) {
                    min=a;
                    n=2;
                }
                else {
                    min=b;
                    n=1;
                }
            }
            else if (b==c) {
                if (b<a) {
                    min=b;
                    n=2;
                }
                else {
                    min=a;
                    n=1;
                }
            }
            System.out.println("3) In numbers {"+a+", "+b+", "+c+"} minimal is "+min+" in quantity "+n+".");
        }
    }

    /**
     * 4) Check is the number even or odd
     * @param n number to check
     */
    public static void evenOdd(int n) {
        if(n%2==0) {
            System.out.println("4) Number " + n + " is even!"); // чет
        }
        else {
            System.out.println("4) Number " + n + " is odd!"); // нечет
        }
    }

    /**
     * 5) does the first number divide the second one without a remainder?
     * @param a first number
     * @param b second number
     */
    public static void divAB(int a, int b) {
        if (a%b==0){
            System.out.println("5) "+a+" divides "+b+" without a remainder.");
        }
        else System.out.println("5) "+a+" doesn't divide "+b+" without a remainder.");
    }

    /**
     * 6) we have two numbers, which one of them is closer to number 10?
     * @param a first number
     * @param b second number
     */
    public static void closeTen(int a, int b) {
        int absA=Math.abs(a-10);
        int absB=Math.abs(b-10);
        if (absA==absB){
            System.out.println("6) Both "+a+" and "+b+" have same distance to 10.");
        }
        else if (absA>absB) {
            System.out.println("6) "+b+" is closer to 10 than "+a+".");
        }
        else System.out.println("6) "+a+" is closer to 10 than "+b+".");
    }

    /**
     * 7) Calculate how much it will cost renting an apartment for a given number of days, if you know,
     that for 1 day its cost is 40 UAH. And, if the tenant has lived in it more than 5 days, he will receive
     discount 20 UAH, and if more than 7 days, the discount will be 50 UAH.
     * @param days number of lease days
     */
    public static void leaseCash(int days) {
        int cash;
        if (days<0){
            System.out.println("7) Days number can not be negative!");
        }
        else {
            if (days>0&&days<=5){
                cash = 40*days;
            }
            else if(days>5&&days<=7){
                cash=40*days-20;
            }
            else cash=40*days-50;
            System.out.println("7) Lease for "+days+" days costs "+cash+" UAH.");
        }
    }
}
