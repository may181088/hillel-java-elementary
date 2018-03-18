package ua.od.hillel;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Tips tipsCalc = new Tips();

        if (args.length == 0) {

            Scanner scr = new Scanner(System.in);

            System.out.println("Select service level: ");
            String impression = scr.nextLine().trim();

            System.out.println("Specify price: ");
            float price = scr.nextFloat();

            System.out.println("Tips: " + tipsCalc.compute(impression, price));

        }else if(args.length==2){
            String impression = args[0];
            float price = Float.parseFloat(args[1]);
            System.out.println("Tips: " + tipsCalc.compute(impression, price));
        }
    }

}