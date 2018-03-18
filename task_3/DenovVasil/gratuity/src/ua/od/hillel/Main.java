package ua.od.hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i=0;
        double many=0, chek=0, gratuity=0;
        boolean b =false;
        Scanner sc =new Scanner(System.in);
        do {
             b =false;
            System.out.println("Input amount from chek ="); //введите сумму из чэка
            chek = sc.nextDouble();
            System.out.println("Input servic lavel" + "\n" +
                    "1- terrible (0%)\n" +
                    "2- poor (5%)\n" +
                    "3- good (10%)\n" +
                    "4- great (15%)\n" +
                    "5- excellent (20%)\n" +
                    "6- enter values again");

            System.out.print("level = ");
            i = sc.nextInt();
            switch (i) {
                case 1: {
                    many = chek;
                    break;
                }
                case 2: {
                    gratuity =  chek / 100 * 5;
                    many = gratuity + chek;
                    break;
                }
                case 3: {
                    gratuity =  chek / 10;
                    many = gratuity + chek;
                    break;
                }
                case 4: {
                    gratuity =  chek / 100 * 15;
                    many = gratuity + chek;
                    break;
                }
                case 5: {
                    gratuity =  chek / 5;
                    many = gratuity + chek;
                    break;
                }
                case 6: {
                    b=true;

                }
                default:
                    break;

            }
        }while(b ==true);
        System.out.println("many = "+ many );

    }
}
