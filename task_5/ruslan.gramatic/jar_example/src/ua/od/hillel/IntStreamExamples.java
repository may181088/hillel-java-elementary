package ua.od.hillel;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author ruslan.gramatic.
 */
public class IntStreamExamples {
    String a = "10";

    public static void main(String[] args) {
        for (int i = 0; i <= 100 ; i+=10) {
            long op = startAlgorithm(i);
            System.out.println("Количество элементов = " + i + "; Операции = " + op);
        }
        // intStreamExamples();
        //test1();
    }

    public static long startAlgorithm(int numberOfElements) {
        int k = 0;
        int n = numberOfElements;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int z = j + 1; z < n; z++) {
                    k++;
                }
            }
        }
        return k;
    }

    public static void test1(){
        int a = 1;
        test2();
    }
    public static void test2(){
        int a = 2;
        test3();
    }
    public static void test3(){
        int a = 3;
        test4();
    }
    public static void test4(){
        int a = 4;
        System.out.println("test4");
    }

    /**
     * Java 8: Replace traditional "for" loops with IntStreams
     */
    public static void intStreamExamples() {
//        IntStream.rangeClosed(1, 50);
//        IntStream.of(1, 2, 8);// > 1, 2, 3
//        IntStream.range(1, 3);// > 1, 2
//        IntStream.rangeClosed(1, 3);// > 1, 2, 3
//        IntStream.range(1, 5).filter(i -> i % 2 == 0).allMatch(i -> i % 2 == 0);// > true
//        IntStream.range(1, 5).filter(i -> i % 2 == 0).noneMatch(i -> i % 2 != 0);// > true
//        IntStream.range(1, 5).anyMatch(i -> i % 2 == 0);// > true
//        IntStream.range(1, 5).max().getAsInt();// > 4
//        IntStream.range(1, 5).min().getAsInt();// > 1
//        IntStream.iterate(0, i -> i + 2).limit(3);// > 0, 2, 4
//        IntStream.range(1, 5).reduce(1, (x, y) -> x * y);// > 24

        int exampleNum = 0;

        System.out.println("===example_" + exampleNum++ + "===");
        boolean a = IntStream.of(2, 4, 8, 10, 12, 22).allMatch(i -> i % 2 == 0);
        System.out.println(a);

        System.out.println("===example_" + exampleNum++ + "===");
        boolean b = IntStream.of(3, 5, 9, 11, 13, 22).anyMatch(i -> i % 2 == 0);
        System.out.println(b);

        System.out.println("===example_" + exampleNum++ + "===");
        boolean c = IntStream.of(3, 5, 9, 11, 13, 23).noneMatch(i -> i % 2 == 0);
        System.out.println(c);

        System.out.println("===example_" + exampleNum++ + "===");
        IntStream.range(1, 5).reduce(1, (x, y) -> x * y);
        System.out.println(b);

        System.out.println("===example_" + exampleNum++ + "===");
        int d = IntStream.of(3, 5, 9, 11, 13, 23).sum();
        System.out.println(d);

        System.out.println("===example_" + exampleNum++ + "===");
        IntStream.of(3, 5, 9, 11, 13, 23).forEach(i -> anyOperation(i));
        System.out.println(d);

    }
    public static void anyOperation(int i) {
        System.out.println(i);
    }
}
