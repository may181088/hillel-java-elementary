/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author AnT1Xr1s
 */
public class Task7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int a = 40;
        System.out.println("Введите количество дней проживания");
        int b = in.nextInt();
        int c = a * b;
        if(b >= 5 & b < 7)
        {
            System.out.println("Стоимость проживания равна:"+ (c-20));
        }
        if(b > 7)
        {
            System.out.println("Стоимость проживания равна:"+ (c-50));
        }
        if(b<5)
        {
            System.out.println("Стоимость проживания равна:"+ c);
        }
    }
    
}
