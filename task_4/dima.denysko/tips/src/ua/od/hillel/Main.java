package ua.od.hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Choose your level");
        System.out.println("terrible poor good great excellent");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Enter money");
        int m = scanner.nextInt();
        System.out.println("You mast pay "+tips(m,s)+" USD");
    }

    public static int tips(int money, String level){
        switch (level){
            case "terrible" :
                return money;
            case "poor" :
                return (int)(money * 1.05);
            case "good" :
                return (int)(money * 1.1);
            case "great" :
                return (int)(money * 1.15);
            case "excellent" :
                return (int)(money * 1.2);
            default:
                System.out.println("unknown level");
                return money;
        }
    }
}
