package hillel.od.ua;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double bill;
        String service;
        System.out.println("How much money you must pay?");
        Scanner sc = new Scanner(System.in);
        bill = sc.nextDouble();
        System.out.println("How do you rate the service? (terrible | poor | good | great | excellent)");
        service = sc.next();
        countTips(bill, service);
    }
    public static void countTips(double bill, String service){
        double tips = 0;
        switch(service){
            case "terrible" : tips = 0;
            break;
            case "poor" : tips = bill * 0.05;
            break;
            case "good" : tips = bill * 0.1;
            break;
            case "great" : tips = bill * 0.15;
            break;
            case "excellent" : tips = bill * 0.2;
        }
        System.out.println("Your bill is " + bill + "$, you should pay " + tips + "$ tips for service");
    }
}
