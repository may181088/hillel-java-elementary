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
public class Task5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше первое число:");
        int a = in.nextInt();
        System.out.println("Введите ваше второе число:");
        int b = in.nextInt();
        if (a % b==0)
        {
            System.out.println("Делится");
        }
        else
        {
            System.out.println("Не делится");
        }
    }
    
}
