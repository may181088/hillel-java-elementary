import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("input two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        Main mn = new Main(); // надоело писать static
        mn.evenOrNo(a, b);
        mn.devisionWithOutResdue(a, b);
        if (a != 10 & b != 10) {
            System.out.println("nearestTo10 :"+ mn.nearestTo10(a, b));

        }
        else {
            if (a == 10) System.out.println("Nearest to 10 is: 10");

            else if (b == 10) System.out.println("Nearest to 10 is: 10 ");

        }

    }

    /**
     *
     * @param z  числа введенные пользователем
     * @param c  числа введенные пользователем
     *  возвращает строку
     */
    void evenOrNo(int z, int c) {

        if (z % 2 == 0) System.out.println(z + " even");
        else System.out.println(z + " is not even");
        if (c % 2 == 0) System.out.println(c + " even");
        else System.out.println(c + " is not even");

    }

    void devisionWithOutResdue(int a, int b) {
        if (a % b == 0) System.out.println("First divids completly into the second");
        else System.out.println("First is not divids completly into the second");
    }

    int nearestTo10(int a, int b) {
        int difference1, difference2;
        difference1 = 10 - a;
        difference2 = 10 - b;
        if (difference1 < 0) difference1 = difference1 * (-1);
        if (difference2 < 0) difference2 = difference2 * (-1);

        if (difference1 < difference2) return a;
        else return b;


    }

}
