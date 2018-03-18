package ua.od.hillel;

import ua.od.hillel.tools.Calculator;

public class MyMainApp {

    public static void main(String[] args) {
        System.out.println("hello JAR!!!");
        Calculator calc = new Calculator();
        System.out.println(calc.add(22, 33));
    }
}
